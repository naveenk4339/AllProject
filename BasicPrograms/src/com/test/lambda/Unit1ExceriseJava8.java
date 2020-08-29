package com.test.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExceriseJava8 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("navee", "seelam", 28), 
				new Person("Mouni", "seelam", 25),
				new Person("charles", "arnold", 28),
				new Person("Lewis", "Bronte", 25));
		// sort List by last name
		Collections.sort(people, (p1, p2) -> p1.getFirstName().toUpperCase().compareTo(p2.getFirstName().toUpperCase()));
		// create a method that print all element in the list
		//printAll(people);
		// create a metho the prints all people last name beginning with c
		/*
		 * printConditionally(people, new Condition() {
		 * 
		 * @Override public boolean test(Person p) {
		 * 
		 * return p.getLastName().startsWith("c"); }
		 * 
		 * });
		 */
		System.out.println("C start");
	

		printConditionally(people, p -> p.getLastName().toUpperCase().startsWith("A"), p -> System.out.println(p));
		System.out.println("start with a");
		
	}

	private static void printAll(List<Person> people) {

		for (Person p : people) {
			System.out.println(p);
		}

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
				
		}
	}

}


