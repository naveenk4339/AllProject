package com.java8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate {
	
	public static void main(String[] args) {
		
		
		 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		 
	       List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());

		 System.out.println("print value greater than 5 using filters : "+collect);
		 
		 Predicate<Integer> noGreaterThan6 = x -> x >6;
		 
		 List<Integer> collect1 = list.stream()
				 .filter(noGreaterThan6)
				 .collect(Collectors.toList());
		 
		 System.out.println("print value greater than 6 using Predicate : "+collect1);
		 
		 Predicate<Integer> noGreaterThan2Less6 = x -> x >2 && x <6;
		 
		 Predicate<Integer> greaterThan3 = x -> x >3;
		 
		 List<Integer> collect2 = list.stream()
				 .filter(noGreaterThan2Less6.and(greaterThan3))
				 .collect(Collectors.toList());
		 
		 System.out.println("print value noGreaterThan2Less6 using Predicate : "+collect2);
		 
		 
	}

}
