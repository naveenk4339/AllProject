package com.test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsExampe {

	public static void main(String[] args) {
		List<Person> people =Arrays.asList(	new Person("navee", "seelam", 28), 
				new Person("Mouni", "seelam", 25),
				new Person("charles", "Crnold", 28),
				new Person("Mouni", "seelam", 25),
				new Person("charles", "Crnold", 28),
				new Person("Lewis", "Bronte", 25),
				new Person("charles" , "Dickens" , 60));
		/*
		 * people.stream() .filter(p -> p.getLastName().startsWith("C")) .forEach(p ->
		 * System.out.println(p.getFirstName()));
		 */
		/*
		 * long count = people.stream() .filter(p -> p.getLastName().startsWith("C"))
		 * .count(); System.out.println("count "+count);
		 */
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		
		
		
		
		IntStream range = IntStream.range(1, 5);
		range.forEach(x -> System.out.println("thead "+ Thread.currentThread().getName()));
		
		IntStream range1 = IntStream.rangeClosed(1, 5);
		range1.forEach(x -> System.out.println("thead 1"+ Thread.currentThread().getName()));
		System.out.println("testing parallel processing");
		System.out.println(range1.parallel());
		
		
		memberNames.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		people.stream().filter(s -> s.getFirstName().startsWith("M")).forEach(System.out::println);

		List<String> tset = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(tset);

		boolean testing = memberNames.stream().noneMatch((s) -> s.startsWith("s"));
		System.out.println(testing);
	//people.stream().distinct().forEach(System.out::println);;

	}

}
