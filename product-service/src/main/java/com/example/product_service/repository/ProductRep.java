package com.example.product_service.repository;

import com.example.product_service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRep extends MongoRepository<Product, String> {
}
