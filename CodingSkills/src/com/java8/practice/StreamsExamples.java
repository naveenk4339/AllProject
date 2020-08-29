package com.java8.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamsExamples {
	private static Employee[] arrayOfEmps = {
		    new Employee(1, "Jeff Bezos", 100000.0), 
		    new Employee(2, "Bill Gates", 200000.0), 
		    new Employee(3, "Mark Zuckerberg", 300000.0)
		};

	public static void main(String[] args) {
	
		Stream.of(arrayOfEmps);
		List<String> namesList  =new ArrayList<String>();
		for(int i=0;i<5;i++) {
			namesList.add("Naveen");
		}
		try {
			whenFileToStream_thenGetStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public static void whenFileToStream_thenGetStream() throws IOException {
	   // List<String> str = getPalindrome(Files.lines(Paths.get(fileName)), 5);
		String fileName ="D:\\Test Documents\\ItemMaster.xlsx";
		String[] words = {
			      "hello", 
			      "refer",
			      "world",
			      "level"
			    };
			    
			    try (PrintWriter pw = new PrintWriter(
			      Files.newBufferedWriter(Paths.get(fileName)))) {
			        Stream.of(words).forEach(pw::println);
			    }
		
		List<String> str =getPalindrome(Files.lines(Paths.get(fileName)), 5);
		System.out.println(str);
	    //assertThat(str, contains("refer", "level"));
	}
	
	
	@SuppressWarnings("unused")
	private static List<String> getPalindrome(Stream<String> stream, int lenght){
		
		return stream.filter(data -> data.length() == lenght).filter(data ->
		data.compareToIgnoreCase(new StringBuilder(data).reverse().toString()) == 0).collect(Collectors.toList()) ;
		
	}

		

}
