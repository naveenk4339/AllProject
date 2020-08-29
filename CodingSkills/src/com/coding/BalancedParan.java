package com.coding;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParan {
	
	static boolean areParenthesisBalance(String expression) {
		
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(int i=0;i<expression.length();i++) {
			
			char x = expression.charAt(i);
			
			if ( x == '(' || x == '{' || x == '[') {
				stack.push(x);
				continue;
			}
			
			if(stack.isEmpty()) 
				return false;
			
			switch(x) {
			
			case ')':{
				stack.pop();
				if(x == '{' || x == '[') 
					return false;
					break;
				
			}
			
			case '}' :{
				stack.pop();
				if(x == '(' || x == '[') 
					return false;
					break;
				
				
			}
			

			case ']' :{
				stack.pop();
				if(x == '(' || x == '{') 
					return false;
					break;
					
	
			}
			
			}
		
	}

		return (stack.isEmpty());	
		
	}		
		
	
		 public static void main(String[] args) 
		    { 
		        String expr = "[({}])"; 
		        if (areParenthesisBalance(expr)) 
		            System.out.println("Balanced "); 
		        else
		            System.out.println("Not Balanced "); 
		    } 

}
			
		
