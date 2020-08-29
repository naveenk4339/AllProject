package com.java8.practice;

public class Order {

	enum Side{
		BUY, SELL;
	}

   private  String symbol ;
   private int quality;
   private double price;
   private  Side side;
   
   public Order(String symbol,int quality,double price,Side side) {
	this.symbol = symbol;
	this.quality = quality;
	this.price = price;
	this.side = side;
}

	public double price() {
		return price;
	}

	public void price(double price) {
		this.price = price;
	}

	public String symbol() {
		return symbol;
	}

	public int quality() {
		return quality;
	}
   
   public Side side()
   {
	   return side;
   }
public String getSymbol() {
	return symbol;
}

public void setSymbol(String symbol) {
	this.symbol = symbol;
}

public int getQuality() {
	return quality;
}

public void setQuality(int quality) {
	this.quality = quality;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Side getSide() {
	return side;
}

public void setSide(Side side) {
	this.side = side;
}
   
}

