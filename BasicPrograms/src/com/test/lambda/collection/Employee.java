package com.test.lambda.collection;

public class Employee {

	private int slno;
	private String name;
	private int number;
	public Employee(int slno, String name, int number) {
		this.slno =slno;
		this.name =name;
		this.number=number;
	}
	
	public String toString() {
		return "Person [ firstName " + slno + " LastName= " + name + " age= " + number;

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
