package com.java.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.omg.CORBA.TIMEOUT;

public class ExecutorEaxmple {
	
	public static void main(String[] args) {
		System.out.println("Inside Thread"+ Thread.currentThread().getName());
		
		System.out.println("Exectuor Framework created :");
//		ExecutorService executortService = Executors.newSingleThreadExecutor();
	
		ExecutorService executortService = Executors.newFixedThreadPool(2);
		
		Runnable runable = () ->{
			System.out.println("Runnable thread"+Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Runnable runable1 = () ->{
			System.out.println("Runnable1 thread"+Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Runnable runable2 = () ->{
			System.out.println("Runnable2 thread"+Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Runnable runable3 = () ->{
			System.out.println("Runnable3 thread"+Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		};
		
		
		executortService.submit(runable);
		executortService.submit(runable1);
		executortService.submit(runable2);
		executortService.submit(runable3);
		
		executortService.shutdown();
		
		
	}

}
