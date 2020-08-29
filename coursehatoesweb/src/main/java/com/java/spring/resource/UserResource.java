package com.java.spring.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.jpa.model.Users;

@RestController
@RequestMapping("/rest/uers")
public class UserResource {

	@GetMapping("/all")
	public List<Users> getAll() {
		Users users1 = new Users("naveen", 200L);
		Users users2 = new Users("mouni", 200L);
		return Arrays.asList(users1, users2);

	}
	@GetMapping("/hateoas/all")
	public List<Users> getHateoasAll() {
		Users users1 = new Users("naveen", 200L);
		Users users2 = new Users("mouni", 200L);
		return Arrays.asList(users1, users2);

	}

}
