package com.sky.product.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.sky.product.dto.CatalougeDto;

@RunWith(MockitoJUnitRunner.class)
public class CatalougeServiceImplTest {
	
	@InjectMocks
	private CatalougeService catalougeService = new CatalougeServiceImpl();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetCatalougeData() {
		List<CatalougeDto> list = catalougeService.getCatalougeData("LONDON");
		Assert.assertNotNull(list);
	}

}
