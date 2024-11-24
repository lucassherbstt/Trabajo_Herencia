package Ejercicio1;

public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioBasePorAsiento;

    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        precioBasePorAsiento -= precioBasePorAsiento * (descuento / 100);
    }

    @Override
    public String getInfoVuelo() {
        return super.getInfoVuelo() + " - Regular con " + numeroAsientos + " asientos. Precio total: $" + calcularPrecio();
    }
}
