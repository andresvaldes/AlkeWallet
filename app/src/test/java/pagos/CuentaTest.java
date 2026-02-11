package pagos; // Cambia esto para que coincida con la carpeta donde está el archivo

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pagos.model.Cuenta; // IMPORTANTE: Importamos la clase Cuenta desde el paquete model
import pagos.model.Paypal;

public class CuentaTest {
    private Cuenta cuenta;

    @BeforeEach
    void setUp() {
        // Inicializamos una cuenta con 1000 para cada test
        cuenta = new Cuenta("Test User", 1000.0);
    }

    @Test
    void testGetSaldoInicial() {
        assertEquals(1000.0, cuenta.getSaldo(), "El saldo inicial debería ser 1000");
    }

@Test
    void testDepositarAumentaSaldo() {
        // Usamos el método que ya definimos antes en Cuenta.java
        // Si no quieres pasarle un objeto Pago, podemos crear un método simple
        cuenta.ingresarFondos(new Paypal("test@mail.com"), 500); 
        assertEquals(1500.0, cuenta.getSaldo(), "El saldo debería aumentar a 1500");
    }

    @Test
    void testRetirarDisminuyeSaldo() {
        cuenta.retirarFondos(400.0);
        assertEquals(600.0, cuenta.getSaldo(), "El saldo debería quedar en 600");
    }

    @Test
    void testNoPermitirSobregiro() {
        // Intentamos retirar más de lo que hay
        cuenta.retirarFondos(2000.0);
        // El saldo NO debería cambiar porque la operación debe fallar
        assertEquals(1000.0, cuenta.getSaldo(), "El saldo no debería cambiar si no hay fondos suficientes");
    }
}