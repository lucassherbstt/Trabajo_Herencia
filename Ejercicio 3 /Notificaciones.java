package Ejercicio3;

public class Notificaciones {
    private CanalNotificacion[] canales;
    private int contador;

    public Notificaciones(int capacidad) {
        canales = new CanalNotificacion[capacidad];
        contador = 0;
    }

    public void agregarCanal(CanalNotificacion canal) {
        if (contador < canales.length) {
            canales[contador++] = canal;
        } else {
            System.out.println("No se pueden agregar más canales de notificación.");
        }
    }

    public void enviarNotificaciones() {
        for (int i = 0; i < contador; i++) {
            canales[i].enviarNotificacion();
        }
    }

    public void personalizarMensajes(String nuevoMensaje) {
        for (int i = 0; i < contador; i++) {
            if (canales[i] instanceof Personalizable) {
                ((Personalizable) canales[i]).personalizarMensaje(nuevoMensaje);
            }
        }
    }

    public void mostrarInformacionCanales() {
        for (int i = 0; i < contador; i++) {
            System.out.println(canales[i].getInfoCanal());
        }
    }
}
