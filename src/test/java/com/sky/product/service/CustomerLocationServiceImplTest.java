package com.sky.product.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CustomerLocationServiceImplTest {
	
	@InjectMocks
	private CustomerLocationService controlWeatherService = new CustomerLocationServiceImpl();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetCustomerLocation() {
		String custLoc = controlWeatherService.getCustomerLocation("123");
		assertEquals(custLoc, "LONDON");
	}

}
