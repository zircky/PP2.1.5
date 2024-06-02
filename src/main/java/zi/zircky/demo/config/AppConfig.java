package zi.zircky.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zi.zircky.demo.models.Egg6;
import zi.zircky.demo.models.Island2;
import zi.zircky.demo.models.Needle7;
import zi.zircky.demo.models.Wood3;

@Configuration
@ComponentScan(basePackages = "zi.zircky.demo")
public class AppConfig {
  @Bean
  public static Island2 getIsland(Wood3 wood) {
    return new Island2(wood);
  }

  @Bean
  public static Egg6 getEgg(Needle7 needle) {
    return new Egg6(needle);
  }
}
