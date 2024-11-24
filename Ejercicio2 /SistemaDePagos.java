package Ejercicio2;

public class SistemaDePagos {
    public static void main(String[] args) {
        // Crear instancia de Pagos con capacidad para 5 métodos de pago
        Pagos pagos = new Pagos(5);

        // Crear métodos de pago
        MetodoPago tarjeta = new TarjetaCredito("Juan Pérez", "1234567890123456", "12/25", "123");
        MetodoPago paypal = new PayPal("Ana López", "0001", "ana@correo.com");

        // Agregar métodos de pago
        pagos.agregarMetodoPago(tarjeta);
        pagos.agregarMetodoPago(paypal);

        // Mostrar información de métodos de pago
        System.out.println("Información de métodos de pago:");
        pagos.mostrarInformacionMetodosPago();

        // Realizar pagos
        System.out.println("\nRealizando pagos:");
        pagos.realizarPagos(100);

        // Cancelar pagos
        System.out.println("\nCancelando pagos:");
        pagos.cancelarPagos();
    }
}
