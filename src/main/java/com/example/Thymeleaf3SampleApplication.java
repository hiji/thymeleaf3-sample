package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;

@SpringBootApplication(exclude = ThymeleafAutoConfiguration.class)
public class Thymeleaf3SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Thymeleaf3SampleApplication.class, args);
	}
}
