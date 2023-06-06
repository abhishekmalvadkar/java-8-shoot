package com.java8.problem;

import java.util.List;

public class Problem_5 {

	public static void main(String[] args) {

		/**
		 * Given a list of integers, find the total number of elements present in the list using Stream functions?
		 */
		
		List<Integer> numbers = List.of(1 , 3 , 5 , 10);
		long totalElements = numbers.stream()
				.count();
		System.out.println(totalElements);

	}


}
