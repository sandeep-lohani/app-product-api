package com.sky.product.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sky.product.dto.CatalougeDto;
import com.sky.product.dto.CatalougeRequest;
import com.sky.product.service.CatalougeService;
import com.sky.product.service.CustomerLocationService;

/**
 * Created by sandeep on 25/06/16.
 */
@RestController
@RequestMapping(value = "/product", produces = APPLICATION_JSON_VALUE)
public class ProductController {
	
    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);
    
    private final CustomerLocationService customerLocationService;
    
    private final CatalougeService catalougeService;

    @Autowired
    public ProductController(CustomerLocationService customerLocationService, CatalougeService catalougeService) {
    	this.customerLocationService = customerLocationService;
    	this.catalougeService = catalougeService;
    }
    
    /**
     * Entry method to return product details for a customer. 
     * @param city
     * @return
     */
    @RequestMapping(value = "/selection", method = GET)
    public
    @ResponseBody
    List<CatalougeDto> getSelectedProductsForCustomer(@RequestParam String customerId) {
        LOG.trace("get selected products for customer :" + customerId);
        //step 1: get the customer location
        String loc = customerLocationService.getCustomerLocation(customerId);
        LOG.info("location returned for customer :" + customerId + " is :" + loc);
        //step 2: get all catalouges
        return catalougeService.getCatalougeData(loc);        
    }
    
    @RequestMapping(value="/confirmation",method = POST)
    public String gotoConfirmPage(CatalougeRequest list, Model model){
        model.addAttribute(list);
        return "redirect:confirm.jsp";
    }
    
    @RequestMapping(value = "/location",method = GET)
    public
    @ResponseBody
    String getCustomerLocation(@RequestParam String customerId) {
        LOG.trace("get customer location data for customer :" + customerId);
        return customerLocationService.getCustomerLocation(customerId);        
    }
    
    @RequestMapping(value = "/catalouge", method = GET)
    public
    @ResponseBody
    List<CatalougeDto> getCatalouge(@RequestParam String locationId) {
        LOG.trace("get catalouge for location :" + locationId);
        return catalougeService.getCatalougeData(locationId);        
    }

}
