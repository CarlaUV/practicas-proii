package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

class listaTest {
    @Test
    public void testParaCadaCopiarEnOtraLista() {
        Lista<String> original = new Lista<>(10);
        original.añadir("uno");
        original.añadir("dos");
        original.añadir("tres");

        Lista<String> copia = new Lista<>(10);

        original.paraCada(s -> copia.añadir(s));

        String toStringEsperado = "[uno, dos, tres]";
        assertEquals(toStringEsperado, copia.toString());
    }

    @Test
    public void testExisteMayorQue100YMenorQue1000() {
        Lista<Integer> original = new Lista<>(10);

        original.añadir(10);
        original.añadir(105);
        original.añadir(9999);
        original.añadir(1117);

        assertTrue(original.existe(elem -> elem > 100));
        assertFalse(original.existe(elem -> elem > 10000));
    }

    @Test
    public void testSoloLosQueEmpiezanPorP() {
        Lista<String> original = new Lista<>(10);
        original.añadir("Podwaidp");
        original.añadir("odwaidp");
        original.añadir("odwaidp");
        original.añadir("Podwaidp");
        original.añadir("odwaidp");

        Lista<String> copia = new Lista<>(10);
        copia = original.soloLosQue(elem -> elem.startsWith("P"));
        assertEquals("[Podwaidp, Podwaidp]", copia.toString());
    }

    @Test
    public void testTransformar() {
        Lista<String> original = new Lista<>(10);
        original.añadir("Podwaidp");
        original.añadir("odwaidp");
        original.añadir("odwaidp");
        original.añadir("Podwaidp");
        original.añadir("odwaidp");

        Lista<Integer> nuevaTranformada = new Lista<>(0);
        nuevaTranformada = original.transformar(elem -> elem.length());

        assertEquals("[8, 7, 7, 8, 7]", nuevaTranformada.toString());
    }

    @Test
    void transformarAceptaFuncionMasGeneralConPecs() {
        Lista<String> nombres = new Lista<>(3);
        nombres.añadir("Ana");
        nombres.añadir("Pepe");
        nombres.añadir("Luis");

        Function<Object, Integer> f = x -> x.toString().length();

        Lista<Number> resultado = nombres.transformar(f);

        assertEquals("[3, 4, 4]", resultado.toString());
    }
}