package com.test.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
	
		int [] someNum = {1,2,3,4,55,7};
		int key =0;
		
		process(someNum , key, (v,k) -> System.out.println(v/k));

	}

	private static void process(int[] someNum, int key , BiConsumer<Integer, Integer> consumer) {
		for(int i : someNum)
		{
			consumer.accept(i, key);
		
		}
		
		
	}
	
	private static BiConsumer<Integer, Integer> wapperLambda(BiConsumer<Integer, Integer> consumer) {
		return consumer;
	}

}
