package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com"})
public class Mouni1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mouni1Application.class, args);
	}

}
