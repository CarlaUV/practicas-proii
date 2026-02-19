package ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
        Cuenta c2 = new Cuenta(500);
        cuenta.ingresar(500);

        assertEquals(600, cuenta.getSaldo(), 0.01);
        assertEquals(saldoTotalInicial+600+100+500, Cuenta.getSaldoTotalBanco(), 0.01);
    } 
}
