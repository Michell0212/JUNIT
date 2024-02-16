import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CirculoTest {
    @Test
    public void testCalcularArea() {
        Circulo circulo = new Circulo(5);
        double areaEsperada = 78.53981633974483;
        double areaCalculada = circulo.calcularArea();
        assertEquals(areaEsperada, areaCalculada, 0.0001);
    }
}