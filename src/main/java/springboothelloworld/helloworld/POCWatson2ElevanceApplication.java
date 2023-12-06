package springboothelloworld.helloworld;

import java.util.concurrent.TimeUnit;

import javax.ws.rs.core.CacheControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springboothelloworld.helloworld.controller.POCWatson2ElevanceController;

@SpringBootApplication
@ComponentScan(basePackageClasses=POCWatson2ElevanceController.class)
public class POCWatson2ElevanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(POCWatson2ElevanceApplication.class, args);
	}
	 @Bean
	   public WebMvcConfigurer corsConfigurer() {
	      return new WebMvcConfigurerAdapter() {
	         @Override
	         public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/poc").allowedOrigins("*");
	         }
	      };
	 }
	
}

