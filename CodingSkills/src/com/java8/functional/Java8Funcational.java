package com.java8.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.apache.commons.codec.digest.DigestUtils;

public class Java8Funcational {
	
	public static void main(String[] args) {
		
		Function<String, Integer> func = x -> x.length();
		 Integer apply = func.apply("naveen"); 
		 
		 System.out.println("finding lenght of naveen word : "+apply);
		 
		 Function<String, String> func1 = x -> x.concat(" test");
		 
		 String apply2 = func1.apply("Service");
		 System.out.println("concating  test with service  using lambda : "+apply2);
		 
		 Function<String, Integer> func2 = x -> x.length();
		 
		 Function<Integer, Integer> func3 = x -> x * 2;
		 
		 Integer result = func2.andThen(func3).apply("naveen");
		 
		 System.out.println("geting length of naveen and then mulitplyning that result "
		 		+ "with 2 : "+result);
		 
		 Java8Funcational obj = new Java8Funcational();
		 
		 List<String> list = Arrays.asList("node", "c++", "java", "javascript");
		 
		 Map<String, Integer> map =obj.convertListToMap(list , x ->x.length());

		 System.out.println("list map converstion "+map);
		 
		 Map<String, Integer> map1 =obj.convertListToMap(list , obj::getLenght);
		 
		 System.out.println("list map2 converstion "+map1);
		 
		 List<String> result1 = obj.convertListToHashedList(list, obj::sha256);
		  
	}

	private <T,R> List<R>  convertListToHashedList(List<T> list, Function<T, R> func) {
		
		List<R> result = new ArrayList<>();
		for(T t: list) {
			result.add(func.apply(t));
		}
		
		return result;
	}
	
	 // sha256 a string
    public String sha256(String str) {
        return DigestUtils.sha256Hex(str);
    }
	
	

	private <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {
		
		Map<T,R> result = new HashMap<T, R>();
		for(T t: list) {
			result.put(t, func.apply(t));
		}
	
		return result;
	} 
	
	private Integer getLenght(String st) {
		
		return st.length();
	}
	

}
