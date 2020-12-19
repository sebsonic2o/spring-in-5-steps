package com.sebsonic2o.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}

	public int findGreatest() {
		int[] data = someCdiDao.getData();
		int greatest = Integer.MIN_VALUE;
		for(int value: data) {
			if(value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}
