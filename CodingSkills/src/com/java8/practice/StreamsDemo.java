package com.java8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		
		List<Order> orderBook= new ArrayList<>();
		Order buyGoogle = new Order("Google.NS", 300, 900.30, Order.Side.BUY);
		Order sellGoogle = new Order("Google.NS", 600, 895, Order.Side.SELL);
		Order buyApple = new Order("Apple.NS", 200, 552.30, Order.Side.BUY);
		Order buySamsung = new Order("Apple.NS", 200, 552.30, Order.Side.BUY);
		Order buyAsus = new Order("Apple.NS", 200, 552.30, Order.Side.BUY);
		Order buyAws = new Order("Apple.NS", 200, 552.30, Order.Side.BUY);
	
		Order sellApple = new Order("Apple.NS", 600, 630, Order.Side.SELL);
	
		orderBook.add(buyApple);
		orderBook.add(sellApple);
		orderBook.add(sellGoogle);
		orderBook.add(buyGoogle);
		orderBook.add(buySamsung);
		orderBook.add(buyAsus);
		orderBook.add(buyAws);
		
		Stream<Order> stream = 	orderBook.stream().filter((Order o)-> o.side().equals(Order.Side.SELL));
	//	System.out.println(stream.count());
		Stream<Order> streams  = orderBook.stream();
		double tes = streams.mapToDouble((Order o) -> o.price()).sum();
		
		orderBook.forEach(test -> System.out.println(test.getQuality()+" " +test.getQuality()));
		//System.out.println(tes);
		
		
	
	}
	
}
