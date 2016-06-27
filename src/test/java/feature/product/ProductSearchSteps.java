package feature.product;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.sky.product.controller.ProductController;
import com.sky.product.dto.CatalougeDto;
import com.sky.product.service.CatalougeServiceImpl;
import com.sky.product.service.CustomerLocationServiceImpl;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductSearchSteps {
    
	ProductController productController = new ProductController(new CustomerLocationServiceImpl(),
			new CatalougeServiceImpl());
	List<CatalougeDto> result = new ArrayList<>();
	String customerId;
 
	@Given(".+customer with the customerId '(.+)'")
	public void addNewBook(final String custId) {
		customerId = custId;
	}
 
	@When("^the customer searches for products available to his location$")
	public void getSelectedProductsForCustomer() {
		result = productController.getSelectedProductsForCustomer(customerId);
	}
	
	@Then("(\\d+) products should have been found$")
	public void verifyAmountOfBooksFound(final int booksFound) {
		Assert.assertTrue(result.size()== booksFound);
	}
}
