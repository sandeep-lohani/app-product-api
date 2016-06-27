package com.sky.product.service;

import com.sky.product.exception.CustomerNotFoundException;
/**
 * Created by sandeep on 25/06/16.
 */
public interface CustomerLocationService {

	/**
	 * This service method takes customer id as an argument and returns the location id. 
	 * @param city
	 * @return WeatherDto
	 */
	String getCustomerLocation(String customerId) throws CustomerNotFoundException;

}
