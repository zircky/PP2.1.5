package zi.zircky.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

  @Autowired
  public Egg6 egg;

  @Override
  public String toString() {
    return ", в утке яйцо " + egg.toString();
  }
}
