package com.test;

public class DeadLock extends Thread{

	public static void main(String[] args) {
		
		final String resource1 = "ratan jaiswal";  
	    final String resource2 = "vimal jaiswal";  
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1  resource1");
					try {
		                // Adding delay so that both threads can start trying to
		                // lock resources
		                Thread.sleep(100);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
					synchronized (resource2) {
						System.out.println("Thread 1  resource2");
					}
				}
				
			}
		};
		Thread t2 = new Thread(){
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1  resource");
					
					synchronized (resource2) {
						System.out.println("Thread 2  resource2");
					}
				}
				
			}
		};
		
t1.start();
t2.start();
	}
	


}
