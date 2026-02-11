package pagos.interfaces;

public interface Conversor {
    // Método para convertir el monto
    double convertir(double monto);
    // Para saber a qué moneda estamos convirtiendo (USD, EUR, etc.)
    String getNombreMoneda();
}