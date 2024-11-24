package Ejercicio2;

    public abstract class MetodoPago {
        protected String titular;
        protected String numero;

        public MetodoPago(String titular, String numero) {
            this.titular = titular;
            this.numero = numero;
        }

        public abstract void realizarPago(double monto);

        public String getInfoMetodoPago() {
            return "Método de pago de " + titular + " con número: " + numero;
        }
    }

