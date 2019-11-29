package com.maapiid.tutorial.anotherservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    @GetMapping(value = "/")
    public String home() {
        return "Welcome in another service";
    }

    @GetMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getCustomers() {
        return Arrays.asList("Customer 1", "Customer 2", "Customer 3");
    }
}
