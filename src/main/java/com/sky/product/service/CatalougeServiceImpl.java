package com.sky.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sky.product.dto.CatalougeDto;
/**
 * Created by sandeep on 25/06/16.
 */
@Component
public class CatalougeServiceImpl implements CatalougeService {

	@Override
	public List<CatalougeDto> getCatalougeData(String locationId) {
		List<CatalougeDto> list = new ArrayList<>();
		switch(locationId){
	    case "LONDON" :
	    	list.add(new CatalougeDto("Sports","Arsenal TV",locationId));
	    	list.add(new CatalougeDto("Sports","Chelsea TV",locationId));
	    	break;
	    case "LIVERPOOL" :
	    	list.add(new CatalougeDto("Sports","Liverpool TV",locationId));
		}
		list.add(new CatalougeDto("News","Sky News",""));
		list.add(new CatalougeDto("News","Sky Sports News",""));
		return list;
	}
	
}
