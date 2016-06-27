package com.open.weather.control.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.util.Assert;

import com.sky.product.controller.ProductController;
import com.sky.product.dto.CatalougeDto;
import com.sky.product.service.CatalougeService;
import com.sky.product.service.CustomerLocationService;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

	@Mock
	private CustomerLocationService customerLocationService;

	@Mock
    private CatalougeService catalougeService;

	@InjectMocks
	private ProductController productController = new ProductController(customerLocationService, catalougeService);;
		
	@Test
	public void testGetSelectedProductsForCustomer() {
		List<CatalougeDto> catalougeDto = mockCatalougeDto();
		Mockito.when(catalougeService.getCatalougeData((Mockito.anyString()))).thenReturn(catalougeDto);
		catalougeDto = productController.getSelectedProductsForCustomer("123");
		Assert.notNull(catalougeDto);
		Assert.isTrue(catalougeDto.get(0).getProduct().equals("prod"));
	}
	
	@Test
	public void testGetCatalouge() {
		Mockito.when(customerLocationService.getCustomerLocation((Mockito.anyString()))).thenReturn("test");
		String loc = productController.getCustomerLocation("123");
		Assert.notNull(loc);
		Assert.isTrue(loc.equals("test"));
	}
	
	private List<CatalougeDto> mockCatalougeDto() {
		List<CatalougeDto> dtos = new ArrayList<>();
		dtos.add(new CatalougeDto("cat","prod","loc"));
        return dtos;
    }

}
