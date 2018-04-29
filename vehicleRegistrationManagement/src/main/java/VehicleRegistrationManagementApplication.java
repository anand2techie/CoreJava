import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EntityScan("com.vehicleregistration.entity")
//@EnableJpaRepositories("com.vehicleregistration.repository")
//@EnableMongoRepositories("com.vehicleregistration.repository")
//@ComponentScan("com.vehicleregistration")
public class VehicleRegistrationManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRegistrationManagementApplication.class, args);
	}
}
