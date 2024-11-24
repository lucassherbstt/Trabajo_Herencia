package Ejercicio1;

public class SistemaReservas {
    public static void main(String[] args) {
      
        Reservas reservas = new Reservas(5);
      

        Vuelo vuelo1 = new VueloRegular("VR123", "Nueva York", "Los Ángeles", "2023-12-01", 150, 200);
        Vuelo vuelo2 = new VueloCharter("VC456", "Miami", "Orlando", "2023-12-02", 5000);

      
        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);

      
        System.out.println("Información de vuelos antes de promociones:");
        reservas.mostrarInformacionVuelos();

      
        reservas.aplicarPromociones(10);

      
        System.out.println("\nInformación de vuelos después de aplicar promociones:");
        reservas.mostrarInformacionVuelos();

      
        System.out.println("\nPrecio total de las reservas: $" + reservas.calcularPrecioTotal());
    }
}
