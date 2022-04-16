package com.example.springboot_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExampleApplication.class, args);
	}

}
