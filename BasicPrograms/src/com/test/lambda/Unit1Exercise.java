package com.test.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("navee", "seelam", 28), new Person("Mouni", "seelam", 25),
				new Person("charles", "arnold", 28), new Person("Lewis", "Bronte", 25));
		// sort List by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o2.getFirstName().compareTo(o1.getFirstName());
			}

		});
		// create a method that print all element in the list
		printAll(people);
		// create a metho the prints all people last name beginning with c
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getLastName().startsWith("c");
			}

		});
		System.out.println("C start");
	

		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getLastName().startsWith("A");
			}

		});
		System.out.println("start with a");
		
	}

	private static void printAll(List<Person> people) {

		for (Person p : people) {
			System.out.println(p);
		}

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p))
				System.out.print(p);
		}
	}

}

 interface Condition {
	boolean test(Person p);

}
