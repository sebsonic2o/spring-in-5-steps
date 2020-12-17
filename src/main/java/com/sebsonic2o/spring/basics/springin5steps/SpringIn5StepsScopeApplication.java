package com.sebsonic2o.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sebsonic2o.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		// Get bean from application context
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO.getJdbcConnection()); // new connection instance

		PersonDAO newPersonDAO = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}", newPersonDAO);
		LOGGER.info("{}", newPersonDAO.getJdbcConnection()); // new connection instance
	}
}
