# Alke Wallet - Digital Wallet Application 🚀

### Proyecto de Gestión de Activos Financieros
Alke Wallet es una aplicación de consola desarrollada en Java que permite a los usuarios gestionar sus finanzas de forma segura y eficiente. Este proyecto forma parte de la evaluación técnica para el rol de Product Manager en **Kick Off Móvil**.

---

## 🛠️ Características Principales
- **Gestión de Cuenta:** Creación de cuenta, consulta de saldo en tiempo real y actualización tras transacciones.
- **Depósitos Multimedio:** Integración con diferentes métodos de origen (PayPal, Bitcoin) mediante interfaces.
- **Seguridad en Retiros:** Validación de fondos para prevenir sobregiros.
- **Conversión de Divisas:** Cálculo dinámico de saldo a Dólares (USD) y Euros (EUR) utilizando una arquitectura escalable.

---

## 🏗️ Arquitectura y Diseño
El proyecto aplica principios de **Programación Orientada a Objetos (POO)** para asegurar un código mantenible y escalable:

- **Interfaces:** Se utilizaron `Pago` y `Conversor` para desacoplar la lógica de negocio de las implementaciones específicas.
- **Clases Abstractas:** `MetodoPagoBase` permite reutilizar la lógica de procesamiento de transacciones.
- **Encapsulamiento:** Atributos privados con acceso mediante métodos públicos para proteger la integridad del saldo.



---

## 🧪 Pruebas Unitarias (Quality Assurance)
Se implementaron tests con **JUnit 5** para garantizar la fiabilidad de las operaciones críticas:
- `testDepositarAumentaSaldo`: Verifica la correcta carga de fondos.
- `testNoPermitirSobregiro`: Asegura que la billetera bloquee retiros superiores al saldo disponible.
- `testRetirarDisminuyeSaldo`: Valida la integridad de los datos tras un retiro.

---

## 🚀 Instalación y Ejecución
1. Clona el repositorio:
   ```bash
   git clone [https://github.com/tu-usuario/AlkeWallet.git](https://github.com/tu-usuario/AlkeWallet.git)

   [Diagrama de Clases Alke Wallet](./docs/diagrama_clases.png)