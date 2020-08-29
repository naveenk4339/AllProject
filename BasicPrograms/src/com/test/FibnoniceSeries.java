package com.test;

import java.util.Scanner;

public class FibnoniceSeries {
	
	public static void main(String[] args) {
		int a=0,b=0,c=1;
		
		Scanner s = new Scanner(System.in);
		int z =s.nextInt();
		
		for(int i =0;i<=z;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(c+" , ");
		}
		
		
	}

}
