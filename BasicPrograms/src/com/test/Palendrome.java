package com.test;

public class Palendrome {

	public static void main(String[] args) {
		
		int palendrome =242;
		
		
		boolean x =isPalendrome(palendrome);
		
		System.out.println("is palendrome"+x);

	}

	private static boolean isPalendrome(int a) {
		
	int palendrome=a;
	 int reverse =0;
	while (palendrome !=0) {
		int remainder = palendrome%10;
		System.out.println(remainder);
		reverse =reverse*10+remainder;
		System.out.println(reverse);
		palendrome=palendrome/10;
		System.out.println(a);
		
		
	}
	if(reverse==palendrome)
	return true;
	else
		return false;
	
	
	
	}

}
