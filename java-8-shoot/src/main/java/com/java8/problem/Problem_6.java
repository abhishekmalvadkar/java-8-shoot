package com.java8.problem;

import java.util.Comparator;
import java.util.List;

class MaxNumberNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public MaxNumberNotFoundException(String message) {
		super(message);
	}
	
	public static MaxNumberNotFoundException doThrow() {
		return new MaxNumberNotFoundException("Maximum number not found");
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
			   .orElseThrow(MaxNumberNotFoundException::doThrow); // T get();
		
		System.out.println(maxNumber);

	}



}
