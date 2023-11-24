package springboothelloworld.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springboothelloworld.helloworld.controller.POCWatson2ElevanceController;

@SpringBootApplication
@ComponentScan(basePackageClasses=POCWatson2ElevanceController.class)
public class POCWatson2ElevanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(POCWatson2ElevanceApplication.class, args);
	}

}
