package com.test.methodreferce;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
Thread th = new Thread(() -> printMessage());
th.start();

	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
