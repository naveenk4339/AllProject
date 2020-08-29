package com.java.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
	
	public static void main(String[] args) {
		
		
		ScheduledExecutorService schdExcSvc = Executors.newScheduledThreadPool(3);
		
		Runnable  task = () -> {
			int i=0;
           int count =i++;
			System.out.println("task system time nano: "+System.nanoTime()+" count"+count);
		};
		System.out.println("task system time nano: "+System.nanoTime()+"Executor after 5 seconds");
		
	//	schdExcSvc.schedule(task, 5, TimeUnit.SECONDS);
		schdExcSvc.scheduleAtFixedRate(task, 0, 10, TimeUnit.SECONDS);
		//schdExcSvc.submit(task);
		
		//schdExcSvc.shutdown();
		
	}

}
