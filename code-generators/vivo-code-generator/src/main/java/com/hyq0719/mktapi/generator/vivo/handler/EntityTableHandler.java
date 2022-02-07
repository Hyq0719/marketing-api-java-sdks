package com.hyq0719.mktapi.generator.vivo.handler;

import com.hyq0719.mktapi.generator.vivo.entity.BaseEntity;
import com.hyq0719.mktapi.generator.vivo.entity.CrawlerResult;
import com.hyq0719.mktapi.generator.vivo.util.GeneratorUtils;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class EntityTableHandler {
  public static int requestTableLoc = 0;
  public static int responseTableLoc = 1;

  public static void setRequestTableLoc(int requestTableLoc) {
    EntityTableHandler.requestTableLoc = requestTableLoc;
  }

  public static void setResponseTableLoc(int responseTableLoc) {
    EntityTableHandler.responseTableLoc = responseTableLoc;
  }

  public static Map<String, List<BaseEntity>> handleByLocation(WebDriver driver, String className,
                                                               int tableLocation) {
    List<WebElement> tableElements = driver.findElements(By.tagName("table"));
    if (tableElements.size() < tableLocation) {
      throw new RuntimeException("Crawler <table> size error");
    }
    WebElement tbody = tableElements.get(tableLocation - 1).findElement(By.tagName("tbody"));
    List<TableElement> defaultTableElements = parseTableElements(tbody);
    return parseDefaultElements(defaultTableElements, className);

  }

  public static CrawlerResult handleRequestAndResponse(WebDriver driver) {
    CrawlerResult crawlerResult = new CrawlerResult();
    WebElement editorContents = driver.findElement(By.className("tui-editor-contents"));
    String requestUrl = "";
    List<WebElement> pElements = editorContents.findElements(By.tagName("p"));
    for (WebElement pElement : pElements) {
      if (pElement.getText().trim().startsWith("https://marketing-api.vivo.com.cn/openapi/")) {
        requestUrl = pElement.getText().trim();
      }
    }
    String entityPrefix = GeneratorUtils.urlToEntityPrefix(requestUrl);
    crawlerResult.setClassPrefix(entityPrefix);

    List<WebElement> tableElements = driver.findElements(By.tagName("table"));
    if (tableElements.size() < Math.max(requestTableLoc, responseTableLoc)) {
      throw new RuntimeException("Crawler <table> size error");
    }
    if (requestTableLoc != -1) {
      WebElement requestTbody = tableElements.get(requestTableLoc).findElement(By.tagName("tbody"));
      List<TableElement> requestTableElements = parseTableElements(requestTbody);
      crawlerResult.setRequestEntityMap(parseRequestElements(requestTableElements, entityPrefix));
    } else {
      String entityRequestName = entityPrefix + "Request";
      Map<String, List<BaseEntity>> requestMap = new HashMap<>(16);
      requestMap.computeIfAbsent(entityRequestName, k -> new ArrayList<>());
      crawlerResult.setRequestEntityMap(requestMap);
    }

    WebElement responseTbody = tableElements.get(responseTableLoc).findElement(By.tagName("tbody"));
    List<TableElement> responseTableElements = parseTableElements(responseTbody);
    crawlerResult.setResponseEntityMap(parseResponseElements(responseTableElements, entityPrefix));

    return crawlerResult;
  }

  public static Map<String, List<BaseEntity>> parseDefaultElements(List<TableElement> tableElements,
                                                                   String className) {
    Stack<TableElement> stack = new Stack<>();
    stack.push(new TableElement(className, "object", className, -1));
    Map<String, List<BaseEntity>> map = new HashMap<>(16);
    map.computeIfAbsent(className, k -> new ArrayList<>());
    parseLevelList(tableElements, stack, map);
    return map;
  }

  public static Map<String, List<BaseEntity>> parseRequestElements(List<TableElement> requestTableElements,
                                                                   String entityPrefix) {
    String entityRequestName = entityPrefix + "Request";
    Stack<TableElement> stack = new Stack<>();
    stack.push(new TableElement(entityRequestName, "object", entityRequestName, -1));

    Map<String, List<BaseEntity>> requestMap = new HashMap<>(16);
    requestMap.computeIfAbsent(entityRequestName, k -> new ArrayList<>());
    parseLevelList(requestTableElements, stack, requestMap);
    return requestMap;
  }

  public static Map<String, List<BaseEntity>> parseResponseElements(List<TableElement> responseTableElements,
                                                                    String entityPrefix) {
    String entityResponseName = entityPrefix + "Response";
    Stack<TableElement> stack = new Stack<>();
    stack.push(new TableElement(entityResponseName, "object", entityResponseName, -1));

    Map<String, List<BaseEntity>> responseMap = new HashMap<>(16);
    responseMap.computeIfAbsent(entityResponseName, k -> new ArrayList<>());

    parseLevelList(responseTableElements, stack, responseMap);
    return responseMap;
  }

  public static List<TableElement> parseTableElements(WebElement tbody) {
    List<TableElement> tableElements = new ArrayList<>();
    List<WebElement> trElements = tbody.findElements(By.tagName("tr"));

    trElements.forEach(webElement -> {
      int dataLevel = Integer.parseInt(webElement.getAttribute("data-level"));
      List<WebElement> tdElements = webElement.findElements(By.tagName("td"));
      TableElement tableElement = getTableElement(tdElements, dataLevel);
      if (tableElement == null || tableElement.getPropertyName().contains("废弃")
              || tableElement.getDescription().contains("（废弃，不再使用）")) {
        return;
      }
      tableElements.add(tableElement);
    });
    return tableElements;
  }

  public static void parseLevelList(List<TableElement> requestTableElements, Stack<TableElement> stack,
                                    Map<String, List<BaseEntity>> map) {
    TableElement lastElement = requestTableElements.get(0);
    for (TableElement tableElement : requestTableElements) {
      TableElement peek = stack.peek();
      if (peek == null) {
        break;
      }
      int stackLevel = peek.getLevel();
      if (tableElement.getLevel() - 1 > stackLevel) {
        map.computeIfAbsent(lastElement.getPropertyName(), k -> new ArrayList<>());
        stack.push(new TableElement(lastElement.getPropertyName(), "object", lastElement.getDescription(),
                lastElement.getLevel()));
      } else if (stackLevel >= tableElement.getLevel()) {
        while (stackLevel != tableElement.getLevel() - 1) {
          if (stack.pop() == null) {
            break;
          }
          stackLevel--;
        }
      }
      peek = stack.peek();
      if (peek == null) {
        break;
      }
      String className = peek.getPropertyName();
      map.get(className).add(getBaseEntity(tableElement));
      lastElement = tableElement;
    }
  }

  public static BaseEntity getBaseEntity(TableElement tableElement) {
    String camelProperty = tableElement.getPropertyName();
    String description = tableElement.getDescription();
    String type = tableElement.getType();
    return new BaseEntity(camelProperty, description, type);
  }

  public static TableElement getTableElement(List<WebElement> tdElements, int level) {
    if (tdElements.size() < 2) {
      return null;
    }
    String property = tdElements.get(0).getText()
            .replace("非必填", "").replace("综搜广告必填", "")
            .replace("必填", "").trim();
    String type = tdElements.get(1).getText().trim();
    String description = tdElements.get(2).getText()
            .replace("\n", " ").trim();
    if (description.length() > 100) {//注释限制长度
      description = description.substring(0, 100) + "...";
    }
    return new TableElement(property, type, description, level);
  }

  @Data
  public static class TableElement {
    private String propertyName;
    private String type;
    private String description;
    private int level;

    public TableElement(String propertyName, String type, String description, int level) {
      this.propertyName = propertyName;
      this.type = type;
      this.description = description;
      this.level = level;
    }
  }
}
