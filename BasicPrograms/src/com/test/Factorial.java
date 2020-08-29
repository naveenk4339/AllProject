package com.test;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,fact=1;
		int num =5;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		int factor = factorl(num);
		System.out.println(factor);
	}

	private static int factorl(int num) {
		
		if(num==0)
		{
			return 1;
		}
			
		else
		return (num*factorl(num-1));
	}

}
