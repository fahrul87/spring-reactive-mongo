package com.fahrul.springreactivemongo.repository;

import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.fahrul.springreactivemongo.dto.ProductDto;
import com.fahrul.springreactivemongo.entity.Product;

import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
	Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);

}
