package com.sky.product.service;

import org.eclipse.jetty.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sky.product.exception.CustomerNotFoundException;
/**
 * Created by sandeep on 25/06/16.
 */
@Component
public class CustomerLocationServiceImpl implements CustomerLocationService {

	private static final Logger LOG = LoggerFactory
			.getLogger(CustomerLocationServiceImpl.class);

	@Override
	public String getCustomerLocation(String customerId) throws CustomerNotFoundException{
		//Validation of customer id
		if(StringUtil.isNotBlank(customerId)){
			return getLocation(customerId);
		} else {
			LOG.error("please enter a valid customer id");
			throw new CustomerNotFoundException("There was a problem retrieving the customer information, "
					+ "please enter a valid customer id");
		}
	}

	//stub the customer location data otherwise it'll come from a service call or database
	private String getLocation(String customerId) {
		switch(customerId){
	    case "123" :
	       return "LONDON";
	    case "135" :
	       return "LIVERPOOL";
	    default : //Optional
	       return "";
	}
		
	}
}
