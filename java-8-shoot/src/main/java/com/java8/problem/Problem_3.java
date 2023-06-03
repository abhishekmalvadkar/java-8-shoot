package com.java8.problem;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;

public class Problem_3 {

	public static void main(String[] args) {

		/**
		 * How to find duplicate elements in a given integers list in java using Stream
		 * functions?
		 */

		List<Integer> numbers = List.of(7, 1, 5, 2, 1, 5, 6, 6, 7);
		List<Integer> duplicateNumbers = numbers.stream()
				.collect(groupingBy(number -> number, counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.map(entry -> entry.getKey())
				.toList();

		System.out.println(duplicateNumbers);

	}

}
