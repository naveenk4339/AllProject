package com.test;

public class PrimeNumber {

	public static void main(String[] args) {
		int m = 0, n = 0;
		

		boolean flag = true;
		int a[] = { 1, 3, 44, 55, 4 };
		int z = a.length;
		
			for (int i = 2; i < z; i++) {
				if(a[i] ==0 || a[i] ==1) {
					System.out.println("is not prime number"+a[i]);
				}
				else
				{
				m = i / 2;
				if (m % a[i] == 0) {
					System.out.println(i+"is not prime number");
					flag = false;
					break;
				}
				}
			}

		if (flag) {
			System.out.println("prime number");
		}
	}

}
