package com.java.webserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class MockitoRestServicesTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockitoRestServicesTestingApplication.class, args);
	}

}
