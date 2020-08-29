package com.java8.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambadaUnderstanding {
	static Maths x = (a, b) -> a + b;

	public static void main(String[] args) {
		
		
		Maths hel = (a, b) -> a - b;

		int y = x.addition(10, 20);
		
		int m = hel.addition(30, 5);
		System.out.println(y+" substraction "+m);
		
		List<String> pointList = new ArrayList<>();
		pointList.add("naven");
		pointList.add("save");
		pointList.add("dfsfs");
		
		
		List<String> nave = new ArrayList<>();
		
		pointList.forEach( p -> {
			
		System.out.println(p);	
		});
		
		pointList.forEach(p -> System.out.println(p));
		
		new Thread(
				() -> {
					System.out.println("My runnable");
				}
				
				).start();
		
		java.lang.Runnable test = () -> {
			System.out.println("  Runnable " + Thread.currentThread().getName());
			
		};
		
	Thread th = new Thread(test);
	th.start();
	
	Comparator<String> s = (String s1, String s2) -> s2.compareTo(s1);
	
	
	}
	
	

	
}

@FunctionalInterface
interface Maths {
	int addition(int a, int b);
}
