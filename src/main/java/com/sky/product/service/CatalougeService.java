package com.sky.product.service;

import java.util.List;

import com.sky.product.dto.CatalougeDto;
/**
 * Created by sandeep on 25/06/16.
 */
public interface CatalougeService {

	/**
	 * This service method takes a location as an argument and returns the catalouge dto. 
	 * @param locationId
	 * @return CustomerDto
	 */
	List<CatalougeDto> getCatalougeData(String locationId);

}
