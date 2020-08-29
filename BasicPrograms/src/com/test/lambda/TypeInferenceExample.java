package com.test.lambda;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLemghLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Hello Lambad"));
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLemghLambda l) {
		System.out.println(l.getLength("Hello Lambad"));
	}
	
	interface StringLemghLambda{
		int getLength(String s);
	}
}
