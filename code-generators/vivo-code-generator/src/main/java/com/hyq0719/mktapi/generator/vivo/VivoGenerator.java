package com.hyq0719.mktapi.generator.vivo;

import com.google.gson.Gson;
import com.hyq0719.mktapi.generator.vivo.entity.BaseEntity;
import com.hyq0719.mktapi.generator.vivo.entity.CrawlerResult;
import com.hyq0719.mktapi.generator.vivo.entity.SingleFileEntity;
import com.hyq0719.mktapi.generator.vivo.handler.CodeGenerator;
import com.hyq0719.mktapi.generator.vivo.handler.CrawlerHandler;
import com.hyq0719.mktapi.generator.vivo.handler.EntityTableHandler;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class VivoGenerator {
  public static void genRequestAndResponse(String url) {
    ChromeDriver chromeDriver = CrawlerHandler.crawler(url);
    CrawlerResult crawlerResult = EntityTableHandler.handleRequestAndResponse(chromeDriver);
    List<SingleFileEntity> singleFileList = CodeGenerator.getSingleFileList(crawlerResult);
    System.out.println(new Gson().toJson(singleFileList));
    CodeGenerator.generateCode(singleFileList);
    chromeDriver.close();
  }

  public static void genByTableLocation(String url, String className, int tableLocation) {
    ChromeDriver chromeDriver = CrawlerHandler.crawler(url);
    Map<String, List<BaseEntity>> map = EntityTableHandler.handleByLocation(chromeDriver, className, tableLocation);
    List<SingleFileEntity> singleFileList = CodeGenerator.getSingleFileList(map, className);
    CodeGenerator.generateCode(singleFileList);
  }

  public static void main(String[] args) {
    String url = "https://open-ad.vivo.com.cn/doc/index?id=424";
    genRequestAndResponse(url);
//    genByTableLocation(url,"BaseTagResDto",3);
  }
}
