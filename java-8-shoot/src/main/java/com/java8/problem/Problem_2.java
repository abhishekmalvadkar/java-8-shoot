package com.java8.problem;

import java.util.List;

class StringPredicate {
	
	public static boolean isStartWithOne(String numberStr) {
		return numberStr.startsWith("1");
	}
	
	private StringPredicate() {
		throw new AssertionError("No com.java8.problem.StringPredicate object for you !");
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
