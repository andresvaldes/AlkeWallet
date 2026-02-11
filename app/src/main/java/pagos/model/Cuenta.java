package pagos.model;

import pagos.interfaces.Pago;

public class Cuenta {
    private String titular;
    private double saldo;

    // Esto arregla el error "The constructor Cuenta(String, double) is undefined"
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Esto arregla "The method verSaldo() is undefined"
    public void verSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo disponible: $" + saldo);
    }

    // Esto arregla "The method ingresarFondos(...) is undefined"
    public void ingresarFondos(Pago metodo, int monto) {
        metodo.pago(monto); 
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Se han cargado $" + monto + " a tu cuenta.");
        }
    }

    // Esto arregla "The method retirarFondos(double) is undefined"
    public void retirarFondos(double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso. Has retirado: $" + monto);
        } else {
            System.out.println("Error: Monto no válido o saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}