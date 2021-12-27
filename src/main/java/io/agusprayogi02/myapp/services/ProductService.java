package io.agusprayogi02.myapp.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.agusprayogi02.myapp.entity.Product;

@Service
public class ProductService {

    private static List<Product> products = Arrays.asList(
            new Product(1L, "PRD001", "Product 1", 10000.0),
            new Product(2L, "PRD002", "Product 2", 20000.0),
            new Product(3L, "PRD003", "Product 3", 30000.0),
            new Product(4L, "PRD004", "Product 4", 40000.0),
            new Product(5L, "PRD005", "Product 5", 50000.0));

    public List<Product> findAll() {
        return products;
    }

}
