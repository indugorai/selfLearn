package com.indu.catalog.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.indu.catalog.beans.Product;
import com.indu.catalog.beans.ProductInfo;
import com.indu.catalog.cassandrarepository.CatalogRepository;

@Controller
public class CatalogController {

	@Autowired
	CatalogRepository repository;

	@RequestMapping(method = RequestMethod.POST, value="/add/product")
	@ResponseBody
	Product AddProduct(@RequestBody ProductInfo productInfo) {
		
		Product product = new Product();
		
		if (null != productInfo && !StringUtils.isEmpty(productInfo.getName())) {
			
			
			product.setId(UUID.randomUUID());
			product.setName(productInfo.getName());
			product.setDescription(productInfo.getDescription());
			product.setCode(productInfo.getCode());
			
			repository.insert(product);
		}

		Optional<Product> foundProduct = repository.findById(product.getId());
		if (foundProduct.isPresent()) {
			return foundProduct.get();
		}
		return null;
	}

	
}
