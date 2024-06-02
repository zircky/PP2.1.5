package zi.zircky.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zi.zircky.demo.models.Ocean1;

@Component
public class KoscheiTheDeathless {
  private Ocean1 ocean;

  public String getRulesByDeth() {
    return "На свете есть океан , " + ocean.toString();
  }

  @Autowired
  public void setOcean(Ocean1 ocean) {
    this.ocean = ocean;
  }
}
