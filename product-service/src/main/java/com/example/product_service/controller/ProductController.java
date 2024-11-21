package com.example.product_service.controller;

import com.example.product_service.dto.ProductReq;
import com.example.product_service.dto.ProductRes;
import com.example.product_service.repository.ProductRep;
import com.example.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductReq productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductRes> getAllProducts() {
        return productService.getAllProducts();
    }
}
