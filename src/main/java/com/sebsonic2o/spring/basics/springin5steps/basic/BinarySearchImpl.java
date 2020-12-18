package com.sebsonic2o.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	private Logger logger =
			LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Sorting
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		// Searching
		return 0;
	}

	@PostConstruct
	public void doPostConstructAction() {
		logger.info("postConstruct");
	}

	@PreDestroy
	public void doPreDestroyAction() {
		logger.info("preDestroy");
	}
}
