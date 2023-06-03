package com.java8.problem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_3 {

	public static void main(String[] args) {

		/**
		 * How to find duplicate elements in a given integers list in java using Stream
		 * functions?
		 */

		List<Integer> numbers = List.of(7, 1, 5, 2, 1, 5, 6, 6, 7);
		Map<Integer, Integer> numberToCountMap = new HashMap<>();

		for (Integer number : numbers) {
			if (numberToCountMap.containsKey(number)) {
				numberToCountMap.put(number, numberToCountMap.get(number) + 1);
			} else {
				numberToCountMap.put(number, 1);
			}
		}

		List<Integer> duplicateNumbers = numberToCountMap.keySet()
				.stream()
				.filter(key -> numberToCountMap.get(key) > 1)
				.toList();


		System.out.println(duplicateNumbers);

	}

}
