package com.test;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {


		Integer[] a = {7,45,66,77,49,10};
		
		bubbleSort(a ,0,a.length);
		
		System.out.println(Arrays.toString(a));

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void bubbleSort(Object[] a, int fromIndex, int toIndex) {
	Object d;
	for(int i = toIndex -1 ; i> fromIndex; i--)
	{
		boolean sorted = true;
		
		for(int j = fromIndex;j<i;j++)
		{
			if(((Comparable) a[j]).compareTo(a[j + 1]) > 0)
			{
				sorted = false;
				d = a[j+1];
				a[j+1] =  a[j];
				a[j] = d;
				
			}
		}
		
		if(sorted)
			break;
			
	}
		
	}

}
