package calculo;

import org.junit.Test;
import static org.junit.Assert.*;

public class Retangulotest {
  @Test
  public void testArea() {
    Retangulo retangulo = new Retangulo(5, 10);
    double resultado = retangulo.area();
    double esperado = 50;
    assertEquals(esperado, resultado, 0);
  }
}
