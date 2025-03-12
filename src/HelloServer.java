import HelloApp.*;
import org.omg.CORBA.*;

public class HelloServer {
    public static void main(String[] args) {
        try {
            // Inicializa el ORB
            ORB orb = ORB.init(args, null);

            // Crea una instancia del objeto remoto
            HelloImpl obj = new HelloImpl();

            // Registra el objeto en el ORB
            orb.connect(obj);

            // Espera solicitudes del cliente
            System.out.println("Servidor CORBA listo...");
            orb.run();
        } catch (Exception e) {
            System.out.println("Error en el servidor: " + e);
        }
    }
}
