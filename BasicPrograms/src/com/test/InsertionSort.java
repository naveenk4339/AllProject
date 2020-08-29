package com.test;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		Integer[] array = new Integer[] {7,565,66,66,77,6565,7676};
		
		//insertionOrder(array, 0,array.length);
		
		System.out.println(Arrays.toString(array));
	}

	/*
	 * private static void insertionOrder(Object[] array, int firstIndex, int
	 * lastIndex) { Object b; for(int i= firstIndex +1 ;i< lastIndex;i++) { b =
	 * array[i]; int j =i;
	 * 
	 * while(j>firstIndex && ((Comparable)a[j-1]).compareTo(b) >0) { array[j] =
	 * array[j-1];
	 * 
	 * } }
	 * 
	 * 
	 * }
	 */

}
