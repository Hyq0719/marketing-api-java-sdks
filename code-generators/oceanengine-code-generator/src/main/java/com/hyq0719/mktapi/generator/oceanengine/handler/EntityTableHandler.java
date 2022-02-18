package com.hyq0719.mktapi.generator.oceanengine.handler;

import com.hyq0719.mktapi.generator.oceanengine.entity.BaseEntity;
import com.hyq0719.mktapi.generator.oceanengine.entity.CrawlerResult;
import com.hyq0719.mktapi.generator.oceanengine.util.GeneratorUtils;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class EntityTableHandler {
  public static int requestTableLoc = 1;
  public static int responseTableLoc = 2;

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

  public static CrawlerResult handleRequestAndResponse(WebDriver driver, String urlPrefix) {
    CrawlerResult crawlerResult = new CrawlerResult();
    String requestUrl = driver.findElement(By.className("a-color")).getText();
    String entityPrefix = GeneratorUtils.urlToEntityPrefix(requestUrl, urlPrefix);
    crawlerResult.setClassPrefix(entityPrefix);

    List<WebElement> tableElements = driver.findElements(By.tagName("table"));
    if (tableElements.size() < Math.min(requestTableLoc, responseTableLoc)) {
      throw new RuntimeException("Crawler <table> size error");
    }
    WebElement requestTbody = tableElements.get(requestTableLoc).findElement(By.tagName("tbody"));
    List<TableElement> requestTableElements = parseTableElements(requestTbody);
    crawlerResult.setRequestEntityMap(parseRequestElements(requestTableElements, entityPrefix));

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
      int dataLevel = Integer.parseInt(webElement.getAttribute("data-key"));
      List<WebElement> tdElements = webElement.findElements(By.tagName("td"));
      TableElement tableElement = getTableElement(tdElements, dataLevel);
      if (tableElement == null) {
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
    String snakeProperty = tableElement.getPropertyName();
    String camelProperty = GeneratorUtils.snakeToCamel(snakeProperty);
    String description = tableElement.getDescription();
    String type = tableElement.getType();
    return new BaseEntity(snakeProperty, camelProperty, description, type);
  }

  public static TableElement getTableElement(List<WebElement> tdElements, int level) {
    if (tdElements.size() < 2) {
      return null;
    }
    By byDiv = By.tagName("div");
    String property = tdElements.get(0).findElement(byDiv).getText().replace("条件必填", "")
      .replace("必填", "").replace("废弃", "").trim();
    String type = tdElements.get(1).findElement(byDiv).getText().trim();
    String description = tdElements.get(2).findElement(byDiv).getText().replace("\n", " ").trim();
    //注释限制长度
    if (description.length() > 100) {
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
