package Ejercicio2;

public class Pagos {
    private MetodoPago[] metodosPago;
    private int contador;

    public Pagos(int capacidad) {
        metodosPago = new MetodoPago[capacidad];
        contador = 0;
    }

    public void agregarMetodoPago(MetodoPago metodoPago) {
        if (contador < metodosPago.length) {
            metodosPago[contador++] = metodoPago;
        } else {
            System.out.println("No se pueden agregar más métodos de pago.");
        }
    }

    public void realizarPagos(double monto) {
        for (int i = 0; i < contador; i++) {
            metodosPago[i].realizarPago(monto);
        }
    }

    public void cancelarPagos() {
        for (int i = 0; i < contador; i++) {
            if (metodosPago[i] instanceof Cancelable) {
                ((Cancelable) metodosPago[i]).cancelarPago();
            }
        }
    }

    public void mostrarInformacionMetodosPago() {
        for (int i = 0; i < contador; i++) {
            System.out.println(metodosPago[i].getInfoMetodoPago());
        }
    }
}
