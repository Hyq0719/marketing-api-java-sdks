package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"test"})

public class MarketingApiTestApp {

  public static void main(String[] args) {
    SpringApplication.run(MarketingApiTestApp.class, args);
  }
}