package com.maapiid.tutorial.simplerest.service;

import com.maapiid.tutorial.simplerest.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {
        return Arrays.asList(new Product(1, "tv", "lcd"),
                new Product(2, "phone", "black"),
                new Product(3, "fridge", "cold"),
                new Product(4, "washing machine", "wet"));
    }
}
