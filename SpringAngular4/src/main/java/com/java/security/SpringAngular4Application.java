package com.java.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"controller"})
public class SpringAngular4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngular4Application.class, args);
	}

}
