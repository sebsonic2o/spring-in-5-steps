package com.sebsonic2o.spring.basics.springin5steps.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="/testContext.xml")
class BinarySearchXmlConfigTest {

	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	void testBasicScenario() {
		assertEquals(0, binarySearch.binarySearch(new int[] {}, 5));
	}
}
