//modelo
//interface
//repositorio
//servicio
//controlador


package Reto5_Web;
import Reto5_Web.interfaces.InterfaceOrder;
import Reto5_Web.interfaces.InterfaceUser;
import Reto5_Web.interfaces.InterfaceSupplements;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto5WebApplication implements CommandLineRunner {
   @Autowired
    private InterfaceSupplements interfaceSupplements;
    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceOrder interfaceOrder;
  
    public static void main(String[] args) {
        SpringApplication.run(Reto5WebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        interfaceSupplements.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
    }

}
