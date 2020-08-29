package com.java8.practice;

public class LongestOfString {
	public static void main(String[] args) {
		
	
	String s ="abcabdc";
	
	int length = lengthOfLongestSubstring(s);
	System.out.println(length);
	}

	 public static int lengthOfLongestSubstring(String s) {
	       
	       int n =s.length(), ans =0;
	        int[] index = new int[128];
	        
	        for(int j=0,i=0;j<n ;j++){
	        	System.out.println(" j value: "+j+" i value: "+i );
	            i=Math.max(index[s.charAt(j)],i);
	            System.out.println("Index s char at: "+index[s.charAt(j)]+" : i value afetr Math.max(index[s.charAt(j)],i) "+ i);
	            ans= Math.max(ans,j-i+1);
	            System.out.println(" ans Math.max(ans,j-i+1) : "+ans);
	            index[s.charAt(j)]=j+1;
	            
	        }
	        System.out.println(ans);
	           return ans;
	           
	        }
}
