package com.java.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableInterfaceDemo {
	
	public static void main(String[] args) {
		
		FutureTask<Integer>[] futureList = new FutureTask[5];
		
		for(int i=0;i<5;i++) {
			Callable<Integer> callable = new CallableTask();
			futureList[i] = new FutureTask<Integer>(callable);
			Thread t = new Thread(futureList[i]);
			t.start();
		}
		
		for(int i=0;i<5;i++) {
			FutureTask<Integer> result = futureList[i];
			try {
				System.out.println("Future Task "+i+" : "+result.get());
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
