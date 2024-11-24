package Ejercicio2;

public class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Realizando pago de $" + monto + " con PayPal de " + titular + " (correo: " + correoElectronico + ")");
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago con PayPal de " + titular);
    }

    @Override
    public String getInfoMetodoPago() {
        return super.getInfoMetodoPago() + " (PayPal) - Correo: " + correoElectronico;
    }
}
