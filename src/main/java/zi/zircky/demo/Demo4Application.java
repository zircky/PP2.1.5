package zi.zircky.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zi.zircky.demo.config.AppConfig;

@SpringBootApplication
public class Demo4Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(AppConfig.class);
    KoscheiTheDeathless koscheiTheDeathless =
        applicationContext.getBean(KoscheiTheDeathless.class);
    System.out.println(koscheiTheDeathless.getRulesByDeth());
  }
}
