package com.java.spring.jpa.model;

import org.springframework.hateoas.ResourceSupport;

public class Users extends ResourceSupport{
	
	private String name;
	private long salary;

	public Users(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
