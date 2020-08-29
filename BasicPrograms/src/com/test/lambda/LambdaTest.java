package com.test.lambda;

public class LambdaTest {
	
	public void greet(Greeting greet) {
		greet.perform();
	}
public static void main(String[] args) {
	LambdaTest test = new LambdaTest();
//	test.greet();
	HelloWorld greets = new HelloWorld();
test.greet(greets);

Greeting myLambdaFunction = () -> System.out.println("Helloworld");
myLambdaFunction.perform();
Greeting innerClass = new Greeting() {
	
	@Override
	public void perform() {
	System.out.println("Hello world");
		
	}
};

test.greet(myLambdaFunction);
test.greet(innerClass);
MyAdd addFunction = (int a, int b) -> a+b;
}
}

@FunctionalInterface
interface MyAdd{
	int add(int a, int b);
}