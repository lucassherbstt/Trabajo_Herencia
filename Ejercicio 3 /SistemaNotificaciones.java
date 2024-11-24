package Ejercicio3;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        // Crear instancia de Notificaciones con capacidad para 5 canales de notificación
        Notificaciones notificaciones = new Notificaciones(5);

        // Crear canales de notificación
        CanalNotificacion correo = new CorreoElectronico("Juan Pérez", "Bienvenido a nuestra plataforma", "juan@correo.com");
        CanalNotificacion mensajeTexto = new MensajeTexto("Ana López", "Su pedido ha sido enviado", "1234567890");

        // Agregar canales de notificación
        notificaciones.agregarCanal(correo);
        notificaciones.agregarCanal(mensajeTexto);

        // Mostrar información de canales de notificación
        System.out.println("Información de canales de notificación:");
        notificaciones.mostrarInformacionCanales();

        // Enviar notificaciones
        System.out.println("\nEnviando notificaciones:");
        notificaciones.enviarNotificaciones();

        // Personalizar mensajes
        System.out.println("\nPersonalizando mensajes de notificación:");
        notificaciones.personalizarMensajes("Actualización: Revise su cuenta para más detalles");

        // Enviar notificaciones con mensajes personalizados
        System.out.println("\nEnviando notificaciones con mensajes personalizados:");
        notificaciones.enviarNotificaciones();
    }
}
