package com.test.lambda;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread myThread = new Thread(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("Printed inside runnable");	
	}
});
myThread.run();

Thread lambdaThread =	new Thread(() -> System.out.println("Printed inside runnable"));
lambdaThread.run();
	}


}
