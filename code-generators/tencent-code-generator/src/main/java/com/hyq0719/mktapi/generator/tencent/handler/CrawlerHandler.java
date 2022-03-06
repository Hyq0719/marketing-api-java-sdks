package com.hyq0719.mktapi.generator.tencent.handler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrawlerHandler {

  public static boolean waitForElementVisible(final By by, WebDriver webDriver, int seconds) {
    try {
      new WebDriverWait(webDriver, seconds).until(ExpectedConditions.visibilityOfElementLocated(by));
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public static ChromeDriver crawler(String url) {
    ChromeDriver driver = new ChromeDriver();
    driver.get(url);
    By tableBy = By.tagName("table");
    if (waitForElementVisible(tableBy, driver, 2)) {
      return driver;
    }
    throw new RuntimeException("Crawler <table> error");

  }
}
