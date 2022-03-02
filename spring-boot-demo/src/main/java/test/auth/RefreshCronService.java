package test.auth;

import cn.hutool.cron.CronUtil;
import cn.hutool.cron.task.Task;
import com.hyq0719.mktapi.common.token.CronService;

/**
 * @author hyq0719
 * @date 2022/3/1 2:36 下午
 */
public interface RefreshCronService extends CronService {
  /**
   * @return cron表达式
   */
  String cron();

  /**
   * @return 广告渠道
   */
  String channel();

  /**
   * 开启定时任务
   */
  @Override
  default void run() {
    CronUtil.schedule(cron(), (Task) () -> {
      try {
        trigger();
      } catch (Exception e) {
        e.printStackTrace();
      }
    });
  }
}
