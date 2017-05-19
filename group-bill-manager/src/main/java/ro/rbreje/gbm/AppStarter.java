package ro.rbreje.gbm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AppStarter {

	public static void main(String[] args) {
		SpringApplication.run(AppStarter.class, args);
	}

}
