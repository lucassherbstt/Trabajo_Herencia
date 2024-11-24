package Ejercicio1;

public abstract class Vuelo {
    protected String numeroVuelo;
    protected String origen;
    protected String destino;
    protected String fecha;

    public Vuelo(String numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public abstract double calcularPrecio();

    public String getInfoVuelo() {
        return "Vuelo " + numeroVuelo + " de " + origen + " a " + destino + " en fecha " + fecha;
    }
}
