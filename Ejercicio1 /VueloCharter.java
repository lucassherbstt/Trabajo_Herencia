package Ejercicio1;

public class VueloCharter extends Vuelo implements Promocionable {
    private double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        precioTotal -= precioTotal * (descuento / 100);
    }

    @Override
    public String getInfoVuelo() {
        return super.getInfoVuelo() + " - Charter. Precio total: $" + calcularPrecio();
    }
}
