package pagos.model;
import pagos.interfaces.Conversor;

public class ConversorEuro implements Conversor {
    private double tasaCambio = 0.0010; // Ejemplo: 1 CLP = 0.0010 EUR

    @Override
    public double convertir(double monto) {
        return monto * tasaCambio;
    }

    @Override
    public String getNombreMoneda() {
        return "Euros (EUR)";
    }
}