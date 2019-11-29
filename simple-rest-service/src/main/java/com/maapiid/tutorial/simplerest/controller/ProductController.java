package com.maapiid.tutorial.simplerest.controller;

import com.maapiid.tutorial.simplerest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/api/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> handleCustomersRequest(Principal principal) {
        return productService.getProducts();
    }

    @GetMapping(value = "/api/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> noSecure(Principal principal) {
        return productService.getProducts();
    }
}
