package pagos.model;
import pagos.interfaces.Conversor;

public class ConversorDolar implements Conversor {
    private double tasaCambio = 0.0011; // Ejemplo: 1 CLP = 0.0011 USD

    @Override
    public double convertir(double monto) {
        return monto * tasaCambio;
    }

    @Override
    public String getNombreMoneda() {
        return "Dólares (USD)";
    }
}