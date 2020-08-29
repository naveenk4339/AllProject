package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.client"})
public class DemosRestConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosRestConsumeApplication.class, args);
	}

}
