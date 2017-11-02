package com.akurati.SpringDataAngular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.akurati.SpringDataAngular.repository")
@SpringBootApplication
public class SpringDataAngularApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDataAngularApplication.class, args);
	}
}
