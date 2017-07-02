package com.ritesh.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ritesh")
public class RestfullServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullServiceApplication.class, args);
	}
}
