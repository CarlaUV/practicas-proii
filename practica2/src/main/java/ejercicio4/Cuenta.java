package ejercicio4;

public class Cuenta {
    private double saldo;
    private static double saldoTotalBanco = 0.0;

    public static double getSaldoTotalBanco() {
        return saldoTotalBanco;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cuenta(double saldo) {
        if(saldo < 0) {
            System.err.println("Error. El saldo inicial debe ser positivo");
            System.exit(1);
        }
        this.saldo = saldo;
        saldoTotalBanco += saldo;
    }

    public void ingresar(double cantidad) {
        if(cantidad < 0) {
            System.err.println("Error. La cantidad debe ser positiva");
            System.exit(1);
        }
        this.saldo += cantidad;
        saldoTotalBanco += saldo;
    }

    public void retirar(double cantidad) {
        if(cantidad <= 0) {
            System.err.println("Error. La cantidad debe ser positiva");
            System.exit(1);
        }
        if(this.saldo - cantidad <= 0) {
            System.err.println("Error. El saldo resultante debe ser positivo o cero");
            System.exit(1);
        }
        this.saldo -= cantidad;
        saldoTotalBanco -= saldo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Saldo = %.2f €".formatted(saldo);
    }
}
