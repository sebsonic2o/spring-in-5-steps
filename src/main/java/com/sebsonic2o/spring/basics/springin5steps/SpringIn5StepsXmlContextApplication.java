package com.sebsonic2o.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sebsonic2o.spring.basics.springin5steps.xml.XmlPersonDAO;

public class SpringIn5StepsXmlContextApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {
		// Get bean from application context
		try(ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")) {

			LOGGER.info("Loaded beans - {}", (Object)applicationContext.getBeanDefinitionNames());

			XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{} connection-{}", personDAO, personDAO.getXmlJdbcConnection());
		}
	}
}
