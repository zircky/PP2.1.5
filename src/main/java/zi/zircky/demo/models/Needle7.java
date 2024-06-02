package zi.zircky.demo.models;

import org.springframework.stereotype.Component;

@Component

public class Needle7 {
  private final Deth8 deth = new Deth8();

  @Override
  public String toString() {
    return ", смерть Кощея на игле " + deth.toString();
  }
}
