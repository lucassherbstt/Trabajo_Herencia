package Ejercicio2;

public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Realizando pago de $" + monto + " con tarjeta de crédito de " + titular);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago con tarjeta de crédito de " + titular);
    }

    @Override
    public String getInfoMetodoPago() {
        return super.getInfoMetodoPago() + " (Tarjeta de Crédito) - Expira: " + fechaExpiracion;
    }
}
