package udea.Mercadolibre.mercadolibre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MercadolibreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercadolibreApplication.class, args);
	}
}
