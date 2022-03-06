package com.hyq0719.mktapi.generator.tencent;

import com.google.gson.Gson;
import com.hyq0719.mktapi.generator.tencent.entity.BaseEntity;
import com.hyq0719.mktapi.generator.tencent.entity.CrawlerResult;
import com.hyq0719.mktapi.generator.tencent.entity.SingleFileEntity;
import com.hyq0719.mktapi.generator.tencent.handler.CodeGenerator;
import com.hyq0719.mktapi.generator.tencent.handler.CrawlerHandler;
import com.hyq0719.mktapi.generator.tencent.handler.EntityTableHandler;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

/**
 * @author hyq0719
 * @date 2022/3/6 3:07 下午
 */
public class TencentGenerator {
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
    String url = "https://developers.e.qq.com/docs/api/authorize/oauth/oauth_token?version=1.3&_preview=1";
    EntityTableHandler.setRequestTableLoc(1);
    EntityTableHandler.setResponseTableLoc(2);
    genRequestAndResponse(url);
//    genByTableLocation(url, "Struct", 3);
  }
}
