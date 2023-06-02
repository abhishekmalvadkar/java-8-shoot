package com.java8.problem;

import java.util.List;

interface StringPredicate {
	
	public static boolean isStartWithOne(String numberStr) {
		return numberStr.startsWith("1");
	}
}

public class Problem_2 {

	public static void main(String[] args) {

		/**
		 * Given a list of integers, find out all the numbers starting with 1 using
		 * Stream functions?
		 */

		List<Integer> numbers = List.of(11, 12, 21, 33, 55 , 131);
		List<String> startWithOneNumbers = numbers.stream()
								.map(String::valueOf)
								.filter(StringPredicate::isStartWithOne)
								.toList();

		startWithOneNumbers.forEach(System.out::println);

	}


}