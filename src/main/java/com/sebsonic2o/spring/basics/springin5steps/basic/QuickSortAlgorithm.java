package com.sebsonic2o.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		// quick sort
		return numbers;
	}
}
