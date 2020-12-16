package com.sebsonic2o.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Sorting
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		// Searching
		return 0;
	}
}
