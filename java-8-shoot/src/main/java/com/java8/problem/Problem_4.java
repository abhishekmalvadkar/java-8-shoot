package com.java8.problem;

import java.util.List;

class RecordNotFoundException extends RuntimeException {
	public RecordNotFoundException(String message) {
		super(message);
	}
}

public class Problem_4 {

	public static void main(String[] args) {

		/**
		 * Given the list of integers, find the first element of the list using Stream functions?
		 */
		
//		T get();
		List<Integer> numbers = List.of(6, 7 , 8);
		Integer firstElement = numbers.stream()
			   .findFirst()
			   .orElseThrow(() -> new RecordNotFoundException("There is not first element in given number list"));
		
		System.out.println(firstElement);

	}

}
