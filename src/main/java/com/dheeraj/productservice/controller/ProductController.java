package com.dheeraj.productservice.controller;

import com.dheeraj.productservice.models.Product;
import com.dheeraj.productservice.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ProductController {

    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public void getAllProducts() {}

    @GetMapping("/products/{id} ")
    public Product getProductDetails(@PathVariable("id") long id) {
        return productService.getProductById(1l);

    }

    public void createProduct(){


    }
}

