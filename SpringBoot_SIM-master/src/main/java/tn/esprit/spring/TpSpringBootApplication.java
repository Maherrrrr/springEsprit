package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
//@ComponentScan("module-service")
@EnableSwagger2

@SpringBootApplication
public class TpSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpSpringBootApplication.class, args);
	}

}
