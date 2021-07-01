package com.fahrul.springreactivemonggo.repository;

import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.fahrul.springreactivemonggo.dto.ProductDto;
import com.fahrul.springreactivemonggo.entity.Product;

import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
	Flux<ProductDto> findByPriceBetween(Range<Double> priceRange);

}
