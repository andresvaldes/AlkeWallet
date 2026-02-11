package pagos.model;

import pagos.interfaces.Pago;

public class Paypal extends MetodoPagoBase {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void procesarTransaccion(int monto) {
        System.out.println("Pago de " + monto + " realizado con Paypal a la cuenta " + email);
    }

    
}
