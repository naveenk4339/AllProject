package com.java8.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTesting {
	
	
	public static void main(String[] args) {
		
		List<String> namesList = new ArrayList<>();
		namesList.add("naveen");
		namesList.add("kumar");
		namesList.add("test");
		namesList.add("mouni");
		namesList.add("test");
		namesList.add("mouni");
		
		List<Integer> integers = new ArrayList<Integer>();
		for(int i=0; i<55;i++) integers.add(i);
		
		Stream<Integer> parallelStream = integers.parallelStream();
		
		Stream<Integer> highNumbers = parallelStream.filter(x -> x > 45);

		highNumbers.forEach(p -> System.out.println("Parallel stream: "+p));
		
		Stream<Integer> sequentalStream  = integers.stream().filter(p -> p > 45);
		
		sequentalStream.forEach( x -> System.out.println("Hight numbers with sequentails: " +x));
		
		/*
		 * Stream test = namesList.parallelStream().distinct(); test.forEach(e ->
		 * System.out.println(e)); System.out.println(); System.out.println(); Stream
		 * sortedList = namesList.stream().sorted();
		 * 
		 * IntStream str = "12345_abcefg".chars(); str.forEach(p ->
		 * System.out.println(p)); System.out.println(); Stream<String> strSplit =
		 * Stream.of("A$B$C".split("\\$")); strSplit.forEach(p ->
		 * System.out.println(p));
		 * 
		 * sortedList.forEach(e -> System.out.println(e)); System.out.println();
		 */
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "naveen");
		map.put(10, "naveen");
		map.put(30, "naveen");
		map.put(40, "naveen");
		map.put(2,"test");
		map.put(3, "maker");
		map.put(5, "java");
		map.put(6, "python");
		
		Stream<Entry<Integer, String>> result =map.entrySet().stream().filter(x -> x.getValue().contains("naveen"));
		
		//System.out.println(result.count());
		
		String stringResult = map.entrySet().stream().filter(x -> x.getValue().startsWith("n")).map(x -> x.getValue()).collect(Collectors.joining());
		
		System.out.println(stringResult);
		
		
		Map<Integer, String> collect = map.entrySet().stream().
				filter(x -> x.getKey() == 3)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		
		System.out.println(collect);
		
		
		
	
	}

}
