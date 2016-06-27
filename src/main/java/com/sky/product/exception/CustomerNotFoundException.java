package com.sky.product.exception;


/**
 * Created by sandeep on 25/06/16.
 */
public class CustomerNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomerNotFoundException(String message){
		super(message);
	}
	
}
