package com.test;

import java.util.HashSet;
import java.util.Set;

public class StringLenght {
	public static void main(String[] args) {
		String name = "testing";
		int ans = lengthOfLongestSubstring(name);

		Answer x = () -> ans + 2;

		String name1 = x.name();
		System.out.println(name1);

	}

	public static int lengthOfLongestSubstring(String s) {

		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;

		while (i < n && j < n) {
			if (!set.contains(s.charAt(j)))
			{
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);

			} 
			else 
			{
				set.remove(s.charAt(i++));
			}
		}

		System.out.println(ans);
		return ans;

	}

}

@FunctionalInterface
interface Answer {
	public int test();

	default String name() {
		return "naveen";
	}

}