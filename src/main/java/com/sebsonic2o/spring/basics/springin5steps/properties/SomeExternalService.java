package com.sebsonic2o.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalService {

	@Value("${external.service.url}")
	private String url; // from property file

	public String getServiceUrl() {
		return url;
	}
}
