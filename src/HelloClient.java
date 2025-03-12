import HelloApp.*;
import org.omg.CORBA.*;

public class HelloClient {
    public static void main(String[] args) {
        try {
            // Inicializa el ORB
            ORB orb = ORB.init(args, null);

            // Obtiene una referencia al objeto remoto
            org.omg.CORBA.Object objRef = orb.string_to_object("corbaloc::localhost:1050/Hello");
            Hello hello = HelloHelper.narrow(objRef);

            // Llama al método remoto
            System.out.println(hello.sayHello());
        } catch (Exception e) {
            System.out.println("Error en el cliente: " + e);
        }
    }
}
