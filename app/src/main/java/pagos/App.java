package pagos; // 1. IMPORTANTE: Declarar el paquete

import java.util.Scanner;
import pagos.interfaces.Conversor;
import pagos.model.Bitcoin;
import pagos.model.ConversorDolar;
import pagos.model.ConversorEuro;
import pagos.model.Cuenta;
import pagos.model.Paypal;

// 2. IMPORTANTE: Todo el código debe vivir dentro de la clase App
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creamos la cuenta inicial
        Cuenta miCuenta = new Cuenta("Usuario Alke", 0.0);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- ALKE WALLET ---");
            System.out.println("1. Ver saldo");
            System.out.println("2. Ingresar dinero (Depositar)");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Convertir saldo a otra moneda");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    miCuenta.verSaldo();
                    break;
                case 2:
                    System.out.println("Monto a ingresar:");
                    int montoIngreso = scanner.nextInt();
                    System.out.println("Seleccione medio de origen: 1.Paypal 2.Bitcoin");
                    int medio = scanner.nextInt();
                    if (medio == 1) {
                        miCuenta.ingresarFondos(new Paypal("user@mail.com"), montoIngreso);
                    } else {
                        miCuenta.ingresarFondos(new Bitcoin("bc1q..."), montoIngreso);
                    }
                    break;
                case 3:
                    System.out.println("Monto a retirar:");
                    double montoRetiro = scanner.nextDouble();
                    miCuenta.retirarFondos(montoRetiro);
                    break;
                case 4:
                    System.out.println("¿A qué moneda quieres convertir tu saldo?");
                    System.out.println("1. Dólares (USD)");
                    System.out.println("2. Euros (EUR)");
                    int monedaOpcion = scanner.nextInt();

                    Conversor conversorSeleccionado = null;
                    if (monedaOpcion == 1) {
                        conversorSeleccionado = new ConversorDolar();
                    } else if (monedaOpcion == 2) {
                        conversorSeleccionado = new ConversorEuro();
                    }

                    if (conversorSeleccionado != null) {
                        double saldoOriginal = miCuenta.getSaldo();
                        double saldoConvertido = conversorSeleccionado.convertir(saldoOriginal);
                        System.out.println("Tu saldo de $" + saldoOriginal + " equivale a: " 
                                           + saldoConvertido + " " + conversorSeleccionado.getNombreMoneda());
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                case 5:
                    System.out.println("¡Gracias por usar Alke Wallet!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        scanner.close();
    }
} // 3. Cierre de la clase App