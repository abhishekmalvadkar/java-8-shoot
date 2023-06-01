package com.java8.problem;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.Predicate;

public class Problem_1 {

	/**
	 * Given a list of integers, find out all the even numbers that exist in the
	 * list using Stream functions?
	 */
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1 , 5 , 2 , 3 , 8 , 7);
		Predicate<Integer> isEvenNumberPredicate = number -> number % 2 == 0;
		List<Integer> evenNumbers = numbers.stream()
			   .filter(isEvenNumberPredicate)
			   .collect(toList());
		// void accept(T t);
		evenNumbers.forEach(System.out::println);
		
		
		
	}

}
