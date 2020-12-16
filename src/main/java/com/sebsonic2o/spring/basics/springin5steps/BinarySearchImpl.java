package com.sebsonic2o.spring.basics.springin5steps;

public class BinarySearchImpl {

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Sorting
		BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
		int[] sortedNumbers = bubbleSort.sort(numbers);
		// Searching
		return 0;
	}
}
