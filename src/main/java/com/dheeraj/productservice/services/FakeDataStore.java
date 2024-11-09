package com.dheeraj.productservice.services;

import com.dheeraj.productservice.models.Product;
import org.springframework.stereotype.Service;

@Service
public class FakeDataStore implements ProductService{
    @Override
    public Product getProductById(Long id) {
        return new Product();
    }
}
