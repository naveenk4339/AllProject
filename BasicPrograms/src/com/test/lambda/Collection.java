package com.test.lambda;

import java.util.Arrays;
import java.util.List;

public class Collection {

	
	public static void main(String[] args) {
		List<Person> people =Arrays.asList(	new Person("navee", "seelam", 28), 
				new Person("Mouni", "seelam", 25),
				new Person("charles", "arnold", 28),
				new Person("Lewis", "Bronte", 25),
				new Person("charles" , "Dickens" , 60));
	for(int i=0;i<people.size();i++) {
		System.out.println(people.get(i));
	}
	
	for(Person i: people) {
		System.out.println(i);
	}
	System.out.println("for reach loop excuation");
	people.forEach(p -> System.out.println(p));
	System.out.println("for reach loop excuation after");
	people.forEach(System.out::println);
	
	}
}
