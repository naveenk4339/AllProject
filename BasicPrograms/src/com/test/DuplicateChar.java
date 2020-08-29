package com.test;

public class DuplicateChar {

	public static void main(String[] args) {
		String name ="Naveen";
		name =name.toUpperCase();
		char[] a = name.toCharArray();
		
		int legthOfArray = a.length;
		
		for(int i=0;i<legthOfArray;i++)
		{
			for(int j=i+1;j<legthOfArray;j++) {
				if(a[i] == a[j])
				{
					System.out.println("duplicate chars "+a[i]);
				}
			}
		}

	}

}
