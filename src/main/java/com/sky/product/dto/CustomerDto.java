package com.sky.product.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by sandeep on 25/06/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDto {
    private String name;
	private String description;
	private String location;
	public CustomerDto() {
		super();
	}
	public CustomerDto(String name, String description, String location) {
		super();
		this.name = name;
		this.description = description;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
