import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args)
    {
       Cliente cliente = new Cliente("1212121","ricardo","mazo","31737190396","rmazo@ho","medellin");
        System.out.println(cliente.getApellido());
        Empleado empleado = new Empleado("1212121","ricardo","mazo","31737190396","rmazo@ho","medellin",10,"0-",TipoEmpleado.CONDUCTOR);
        System.out.println(empleado.getTipoEmpleado());
        Paquete paquete = new Paquete(TipoPaquete.LIVIANO, 1.5, 100000);
        Envio envio = new Envio (cliente, "Medellin", "Rionogre", "call45", "roberto pela", 123456787, LocalDate.now().atStartOfDay(), EstadoEnvio.EN_RUTA, 45555, paquete);
        System.out.println(envio.getHoraEntrega());
    }
}