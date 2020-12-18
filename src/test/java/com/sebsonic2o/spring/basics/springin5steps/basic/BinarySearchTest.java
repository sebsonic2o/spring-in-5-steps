package com.sebsonic2o.spring.basics.springin5steps.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sebsonic2o.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringIn5StepsBasicApplication.class)
class BinarySearchTest {

	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	void testBasicScenario() {
		assertEquals(0, binarySearch.binarySearch(new int[] {}, 5));
	}
}
