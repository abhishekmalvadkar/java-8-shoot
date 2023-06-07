package com.java8.problem;

import java.util.Comparator;
import java.util.List;

class MaxNumberNotFoundException extends RuntimeException{
	
	public MaxNumberNotFoundException(String message) {
		super(message);
	}
	
}

public class Problem_6 {

	private static final Comparator<Integer> INTEGER_NATURAL_ORDER_COMPARATOR = Comparator.naturalOrder();

	public static void main(String[] args) {

		/**
		 *  Given a list of integers, find the maximum value element present in it using Stream functions?
		 */
		
		List<Integer> numbers = List.of(1,4 , 6 , 10 , 6);

		Integer maxNumber = numbers.stream()
			   .max(INTEGER_NATURAL_ORDER_COMPARATOR) // int compare(T o1, T o2);
			   .orElseThrow(() -> new MaxNumberNotFoundException("Maximum number not found")); // T get();
		
		System.out.println(maxNumber);

	}


}
