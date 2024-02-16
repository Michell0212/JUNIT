import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MCDTest {
    @Test
    public void testCalcularMCD() {
        MCD mcd = new MCD();
        int mcdEsperado = 10;
        int mcdCalculado = mcd.calcularMCD(20, 10);
        assertEquals(mcdEsperado, mcdCalculado);
    }
}