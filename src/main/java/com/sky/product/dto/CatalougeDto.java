package com.sky.product.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by sandeep on 25/06/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalougeDto {
    private String category;
	private String product;
	private String location;
	public CatalougeDto() {
		super();
	}
	public CatalougeDto(String category, String product, String location) {
		super();
		this.category = category;
		this.product = product;
		this.location = location;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
