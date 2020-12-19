package com.sebsonic2o.spring.basics.springin5steps.cdi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {

	@Mock
	SomeCdiDao daoMock;

	@InjectMocks
	SomeCdiBusiness business;

	@Test
	void testBasicScenario() {
		when(daoMock.getData()).thenReturn(new int[] {5, 89});
		assertEquals(89, business.findGreatest());
	}
}
