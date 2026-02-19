package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TipoIVATest {
    @Test
    public void testCalcualarPrecioFinalConIVAGeneral() {
        double precioBase = 100.0;
        double precioEsperado = 121.0;

        double precioCalculado = TipoIVA.GENERAL.calcularPrecioFinal(precioBase);

        assertEquals(precioEsperado, precioCalculado, 0.001, "El precio calculado de para 100 debería ser 121");
    }

    @Test
    public void testPorcentajeIVAReducido() {
        assertEquals(0.10, TipoIVA.REDUCIDO.getPorcentaje(), 0.001);
    }

    @Test
    public void testCalcualarPrecioFinalConIVAExento() {
        double precioBase = 100.0;
        double precioEsperado = 100.0;

        double precioCalculado = TipoIVA.EXENTO.calcularPrecioFinal(precioBase);

        assertEquals(precioEsperado, precioCalculado, 0.001, "El precio calculado de para 100 debería ser 121");
    }
}