package pagos.model;

import pagos.interfaces.Pago;

public class Bitcoin extends MetodoPagoBase {
    private String billetera;

    public Bitcoin(String billetera) {
        this.billetera = billetera;
    }

    @Override
    public void procesarTransaccion(int monto) {
        System.out.println("Pago de " + monto + " realizado con Bitcoin a la billetera " + billetera);
    }
}
