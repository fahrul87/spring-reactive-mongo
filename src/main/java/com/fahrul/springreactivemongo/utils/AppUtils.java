package com.fahrul.springreactivemongo.utils;

import org.springframework.beans.BeanUtils;

import com.fahrul.springreactivemongo.dto.ProductDto;
import com.fahrul.springreactivemongo.entity.Product;

public class AppUtils {

	public static ProductDto entityToDto(Product product) {
		ProductDto productDto = new ProductDto();
		BeanUtils.copyProperties(product, productDto);
		return productDto;
	}

	public static Product dtoToEntity(ProductDto productDto) {
		Product product = new Product();
		BeanUtils.copyProperties(productDto, product);
		return product;
	}

}
