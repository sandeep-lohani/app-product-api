package com.sky.product.dto;

import java.util.List;
/**
 * Created by sandeep on 25/06/16.
 */
public class CatalougeRequest {
	
	List<CatalougeDto> list;
	
	String customerId;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<CatalougeDto> getList() {
		return list;
	}

	public void setList(List<CatalougeDto> list) {
		this.list = list;
	}

}
