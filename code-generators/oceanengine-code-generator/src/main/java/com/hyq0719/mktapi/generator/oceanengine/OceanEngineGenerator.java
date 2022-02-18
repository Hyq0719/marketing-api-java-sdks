package com.hyq0719.mktapi.generator.oceanengine;

import com.google.gson.Gson;
import com.hyq0719.mktapi.generator.oceanengine.entity.BaseEntity;
import com.hyq0719.mktapi.generator.oceanengine.entity.CrawlerResult;
import com.hyq0719.mktapi.generator.oceanengine.entity.SingleFileEntity;
import com.hyq0719.mktapi.generator.oceanengine.handler.CodeGenerator;
import com.hyq0719.mktapi.generator.oceanengine.handler.CrawlerHandler;
import com.hyq0719.mktapi.generator.oceanengine.handler.EntityTableHandler;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class OceanEngineGenerator {
  private static final String URL_PREFIX = "https://ad.oceanengine.com/open_api/2/";

  public static void genRequestAndResponse(String url) {
    ChromeDriver chromeDriver = CrawlerHandler.crawler(url);
    CrawlerResult crawlerResult = EntityTableHandler.handleRequestAndResponse(chromeDriver, URL_PREFIX);
    List<SingleFileEntity> singleFileList = CodeGenerator.getSingleFileList(crawlerResult);
    System.out.println(new Gson().toJson(singleFileList));
    CodeGenerator.generateCode(singleFileList);
    chromeDriver.close();
  }

  public static void genByTableLocation(String url, String className, int tableLocation) {
    ChromeDriver chromeDriver = CrawlerHandler.crawler(url);
    Map<String, List<BaseEntity>> map = EntityTableHandler.handleByLocation(chromeDriver, className, tableLocation);
    System.out.println(new Gson().toJson(map));
    List<SingleFileEntity> singleFileList = CodeGenerator.getSingleFileList(map, className);
    CodeGenerator.generateCode(singleFileList);
  }

  public static void main(String[] args) {
    String url = "https://open.oceanengine.com/doc/index.html?key=ad&type=api&id=1696710552261644#item-link-%"
      + "E5%9F%BA%E7%A1%80%E5%88%9B%E6%84%8F%E4%BF%A1%E6%81%AF";
    genRequestAndResponse(url);
//        genByTableLocation(url, "BaseCreativeStruct", 4);
  }
}
