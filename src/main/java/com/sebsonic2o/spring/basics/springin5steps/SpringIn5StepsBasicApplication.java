package com.sebsonic2o.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sebsonic2o.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	// What are the beans? => @Component
	// What are the dependencies for a bean? => @Autowired
	// Where to search for beans? => No need here as beans are in spring application package

	public static void main(String[] args) {
		// Get bean from application context
		try(AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)) {

			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 4);
			System.out.println(result);

			BinarySearchImpl newBinarySearch = applicationContext.getBean(BinarySearchImpl.class);
			int newResult = newBinarySearch.binarySearch(new int[] {12, 4, 6}, 4);
			System.out.println(newResult);
		}
	}
}
