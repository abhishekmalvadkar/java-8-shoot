package com.java8.problem;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

class MapPredicate{
	
	public  boolean isCountMoreThanOne(Entry<Integer, Long> entry) {
		return entry.getValue() > 1;
	}
}

public class Problem_3 {

	public static void main(String[] args) {

		/**
		 * How to find duplicate elements in a given integers list in java using Stream
		 * functions?
		 */

		List<Integer> numbers = List.of(7, 1, 5, 2, 1, 5, 6, 6, 7);
		Map<Integer, Long> numberToCountMap = numbers.stream()
				.collect(groupingBy(Function.identity(), counting()));
		MapPredicate mapPredicate = new MapPredicate();
		List<Integer> duplicateNumbers = numberToCountMap
				.entrySet()
				.stream()
				.filter(mapPredicate::isCountMoreThanOne)
				.map(Entry::getKey)
				.toList();

		System.out.println(duplicateNumbers);

	}


}
