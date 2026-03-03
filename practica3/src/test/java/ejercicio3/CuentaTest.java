package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import proii.ejercicio3.Cuenta;

public class CuentaTest {
    @Test
    public void testCrearCuentaConSaldoInicial() {
        double saldoTotalInicial = Cuenta.getSaldoTotalBanco();
        Cuenta cuenta = new Cuenta(1000);
        
        assertEquals(1000, cuenta.getSaldo());
        assertEquals(saldoTotalInicial+1000, Cuenta.getSaldoTotalBanco(), 0.01);
    }

    @Test
    public void testIngresarDinero() {
        double saldoTotalInicial = Cuenta.getSaldoTotalBanco();
        Cuenta cuenta = new Cuenta(100);
        cuenta.ingresar(500);

        assertEquals(600, cuenta.getSaldo(), 0.01);
        assertEquals(saldoTotalInicial+600+100+500, Cuenta.getSaldoTotalBanco(), 0.01);
    }

    @Test
    public void saldoInicialNegativoTest() {
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> new Cuenta(-100));
        assertEquals("El saldo inicial debe ser mayor que 0", ex.getMessage());
    }

    @Test
    public void saldoInsuficienteTest() {
        IllegalArgumentException ex = assertThrows(
            IllegalArgumentException.class,
            () -> new Cuenta(100).retirar(200));
        assertEquals("Saldo insuficiente", ex.getMessage());
    }
}