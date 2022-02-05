package com.hyq0719.spring.starter.mktapi.vivo.config;

import cn.hutool.cron.CronUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class CronJobAutoConfiguration implements InitializingBean, DisposableBean {


  @Override
  public void destroy() throws Exception {
    try {
      CronUtil.stop();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    log.info("[CRONJOB] TOKEN REFRESH JOB START");
    try {
      CronUtil.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
    log.info("[CRONJOB] TOKEN REFRESH JOB START FINISH");
  }
}
