package com.java.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.java.controller")
public class JerseyRestWebServicesApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		
		 new JerseyRestWebServicesApplication().configure(new SpringApplicationBuilder(JerseyRestWebServicesApplication.class)).run(args);
	}

	
}
