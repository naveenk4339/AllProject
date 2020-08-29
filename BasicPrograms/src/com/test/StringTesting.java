package com.test;

import java.util.HashSet;
import java.util.Set;

public class StringTesting {
	
	public static void main(String arg[]) {
		String name ="naveen";
		
		lengthOfLongestSubstring(name);
		System.out.println(lengthOfLongestSubstring(name));
	}

	
	 public static int lengthOfLongestSubstring(String s)
	    {
	        int n= s.length();
	        int ans =0;
	        for(int i=0;i<n;i++)
	            for(int j=i+1;i<=n;j++)
	                if(allUnique(s,i,j)) ans=Math.max(ans,j-i);
	                    
	    return ans;
	        
	    }
	    
	    public static boolean allUnique(String s, int start, int end){
	        Set<Character> set = new HashSet<>();
	        for(int i=start;i<end;i++){
	        
	            Character ch = s.charAt(i);
	            if(set.contains(ch)) return false;
	        set.add(ch);
	        }
	        
	        return true;
	    }
}
