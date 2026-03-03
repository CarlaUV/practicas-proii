package proii.ejercicio3;

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
            throw new IllegalArgumentException("El saldo inicial debe ser mayor que 0");
        }
        this.saldo = saldo;
        saldoTotalBanco += saldo;
    }

    public void ingresar(double cantidad) {
        if(cantidad < 0) {
            throw new IllegalArgumentException("No puedes ingresar una cantidad negativa");
        }
        this.saldo += cantidad;
        saldoTotalBanco += saldo;
    }

    public void retirar(double cantidad) {
        if(cantidad <= 0) {
            throw new IllegalArgumentException("No puedes retirar una cantidad negativa");
        }
        if(this.saldo - cantidad <= 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
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