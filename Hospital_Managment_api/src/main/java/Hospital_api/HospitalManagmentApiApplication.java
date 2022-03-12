package Hospital_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"Hospital_api"})
public class HospitalManagmentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagmentApiApplication.class, args);
	}

}
