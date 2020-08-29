package com.java.executor;

public class RunableLamda {
	
	public static void main(String[] args) {
		
		Runnable run = () ->{
			System.out.println("Runnable"+Thread.currentThread().getName());
		};
		
		Thread thread = new Thread(run);
		
		System.out.println("Starting Thread...");
        thread.start();
		System.out.println("Thread "+thread.currentThread().getName());
	}

}
