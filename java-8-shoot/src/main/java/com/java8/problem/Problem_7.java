package com.java8.problem;

import java.util.List;

public class Problem_7 {

	public static void main(String[] args) {
		/**
		 * Given a list of integers, sort all the values present in it using Stream functions?
		 */
		
		List<Integer> numbers = List.of(1 , 10 , 9 , 5 , 3);
		List<Integer> natualSortedNumbers = numbers.stream()
		       .sorted()
		       .toList();
		
		System.out.println(natualSortedNumbers);
	}

}
