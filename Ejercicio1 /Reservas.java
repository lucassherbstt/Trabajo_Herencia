package Ejercicio1;

public class Reservas {
    private Vuelo[] vuelos;
    private int contador;

    public Reservas(int capacidad) {
        vuelos = new Vuelo[capacidad];
        contador = 0;
    }

    public void agregarVuelo(Vuelo vuelo) {
        if (contador < vuelos.length) {
            vuelos[contador++] = vuelo;
        } else {
            System.out.println("No se pueden agregar más vuelos.");
        }
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += vuelos[i].calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones(double descuento) {
        for (int i = 0; i < contador; i++) {
            if (vuelos[i] instanceof Promocionable) {
                ((Promocionable) vuelos[i]).aplicarPromocion(descuento);
            }
        }
    }

    public void mostrarInformacionVuelos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(vuelos[i].getInfoVuelo());
        }
    }
}
