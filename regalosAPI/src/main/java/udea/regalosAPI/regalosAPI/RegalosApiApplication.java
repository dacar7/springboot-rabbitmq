package udea.regalosAPI.regalosAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RegalosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegalosApiApplication.class, args);
	}
}
