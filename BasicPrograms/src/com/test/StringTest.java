package com.test;

import java.util.HashSet;
import java.util.Set;

public class StringTest {

	public static void main(String[] args) {
		
		String name ="Naveen";
		Set<Character> lengthString = lengthOfString(name.toLowerCase());
		System.out.println(lengthString);
		
		String str = String.valueOf(lengthString);
		System.out.println(str);
	}

	private static Set<Character> lengthOfString(String lowerCase) {
		Set<Character> setString = new HashSet<>();
		char[] charArry = lowerCase.toCharArray();
		
		for(int i=0;i<charArry.length;i++) {
			
				setString.add(charArry[i]);
			
				
		}
		
		
		
		return  setString;
		
	}
}
