package com.sebsonic2o.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	// What are the beans? => @Component
	// What are the dependencies for a bean? => @Autowired
	// Where to search for beans? => No need here as beans are in spring application package

	public static void main(String[] args) {
		// Get bean from application context
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 4);
		System.out.println(result);
	}
}
