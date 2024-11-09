package com.dheeraj.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ProductController {

    @GetMapping("/products")
    public void getAllProducts() {}

    @GetMapping("/products/{id} ")
    public void getProductDetails(@PathVariable("id") long id) {

    }

    public void createProduct(){


    }
}

