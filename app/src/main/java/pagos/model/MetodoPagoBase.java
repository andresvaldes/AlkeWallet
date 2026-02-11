package pagos.model;

import pagos.interfaces.Pago;

public abstract class MetodoPagoBase implements Pago {

    @Override
    public final void pago(int monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto (" + monto + ") debe ser mayor a cero.");
            return;
        }
        procesarTransaccion(monto);
    }

    protected abstract void procesarTransaccion(int monto);
}