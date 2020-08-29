package com.java.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {

	@GetMapping("/")
	public String home() {
		System.out.println("Hello");
		
		return ("<h1>Welcome</h1>");
	}
	
	@GetMapping("/user")
//	@PostMapping("")
//	@RequestMapping()
	public String user() {
		
		
		return "<h1> Welcome user</h1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		
		
		return "<h1> Welcome admin</h1>";
	}
}
