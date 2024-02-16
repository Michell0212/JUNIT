import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ValidadorDeEmailTest {
    @Test
    public void testValidarEmail() {
        ValidadorDeEmail validador = new ValidadorDeEmail();

        // Casos de prueba válidos
        assertTrue(validador.validarEmail("prueba@ejemplo.com"));
        assertTrue(validador.validarEmail("prueba.123@ejemplo.org"));
        assertTrue(validador.validarEmail("prueba+alias@ejemplo.com"));

        // Casos de prueba inválidos
        assertFalse(validador.validarEmail("prueba@ejemplo"));
        assertFalse(validador.validarEmail("prueba@.com"));
        assertFalse(validador.validarEmail("prueba@ejemplo..com"));