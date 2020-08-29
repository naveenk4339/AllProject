package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;

public class MethodReference {
	
	public void myMetho() {
		System.out.println("instance Method");
	}
	
	public int addition(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
	
		MethodReference tests = new MethodReference();
		
		Methods ref = tests::myMetho;
		
		BiFunction<Integer, Integer, Integer> product = Matho::addition;
		
		int pr = product.apply(10, 120);
		System.out.println("prodyct : "+pr);
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "naveen");
		map.put(2, "test");
		map.put(2, "mouni");
		
		map.forEach((k,v)-> System.out.println(k+" : : "+v));
		map.entrySet().stream()
		.forEach(e -> System.out.println(e.getKey() + " : "+e.getValue()));
		List<String> nameFirst = Arrays.asList("naveen","mouni","tset");
		
		
		ref.display();
		//int a=100,b=20;
		
	//	Methods test = (a,b) -> a+b;
		
		
		String[] stringArry = {"Steve", "Naveen","MOuni","REsts"};
		
		//Arrays.sort(stringArry,String::compareToIgnoreCase);
		System.out.println(" errir"+Arrays.toString(stringArry));
	}
	

}
@FunctionalInterface
interface Methods{
	
	void display();
}


interface Matho{
	static int addition(int a, int b) {
		return a+b;
	}
}