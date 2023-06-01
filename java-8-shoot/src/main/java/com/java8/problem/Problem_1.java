package com.java8.problem;

import java.util.List;

public class Problem_1 {

	/**
	 * Given a list of integers, find out all the even numbers that exist in the
	 * list using Stream functions?
	 */
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1 , 5 , 2 , 3 , 8 , 7);
		List<Integer> evenNumbers = numbers.stream()
			   .filter(Problem_1::isEvenNUmber)
			   .toList();
		// void accept(T t);
		evenNumbers.forEach(System.out::println);
		
		
		
	}

	private static boolean isEvenNUmber(Integer number) {
		return number % 2 == 0;
	}

}
