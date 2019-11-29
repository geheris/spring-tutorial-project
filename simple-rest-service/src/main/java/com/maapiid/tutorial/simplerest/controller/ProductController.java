package com.maapiid.tutorial.simplerest.controller;

import com.maapiid.tutorial.simplerest.model.Product;
import com.maapiid.tutorial.simplerest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController implements ProductControllerApi {

    @Autowired
    private ProductService productService;

    @Override
    public String home() {
        return "Welcome";
    }

    @Override
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}

