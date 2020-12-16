package com.sebsonic2o.spring.basics.springin5steps;

public class BinarySearchImpl {

	private SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Sorting
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		// Searching
		return 0;
	}
}
