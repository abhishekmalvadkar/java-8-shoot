package com.java8.problem;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;

public class Problem_3 {

	public static void main(String[] args) {

		/**
		 * How to find duplicate elements in a given integers list in java using Stream
		 * functions?
		 */

		List<Integer> numbers = List.of(7, 1, 5, 2, 1, 5, 6, 6, 7);
		List<Integer> duplicateNumbers = numbers.stream()
				.collect(groupingBy(Function.identity(), counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.map(Entry::getKey)
				.toList();

		System.out.println(duplicateNumbers);

	}

}
