package com.example.product_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@Document(value = "product")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
