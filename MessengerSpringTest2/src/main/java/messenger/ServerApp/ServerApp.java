package messenger.ServerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("messenger")
@EntityScan("messenger")
@SpringBootApplication
public class ServerApp {

	public static void main(String[] args) {
		SpringApplication.run(ServerApp.class, args);
	}
}
