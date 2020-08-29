package com.test;

public class PalendromeString {

	public static void main(String[] args) {
		
		String name ="MOM";
		
		char[] a =name.toCharArray();
		char b;
		
		int x = a.length;
		
		for(int i=x;i>0;i--)
		{
			b =a[i];
			
		}
		
		
		boolean isPaldrome =true;
		for(int i=0;i<x;i++) {
			if(name.charAt(i) != name.charAt(x-1-i)) {
				
				isPaldrome = false;
				break;
				
			}
		}
		if(isPaldrome)
		System.out.println("is palindrome");
			
			StringBuilder v = new StringBuilder("MOM");
			StringBuilder z =v.reverse();
			if(v==z)
			{
				System.out.println(v+"is palindrome");
			}
			
			String m = "TST";
			StringBuffer bb = new StringBuffer() ;
			for(int i=m.length()-1;i>=0;i--)
			{
				bb= bb.append(m.charAt(i)) ;
			}
			
			if(bb.toString().equals(m)) {
				System.out.println("palindrome");
			}
	}
	
	

}
