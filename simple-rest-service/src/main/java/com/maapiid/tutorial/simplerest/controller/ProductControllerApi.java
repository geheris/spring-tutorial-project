package com.maapiid.tutorial.simplerest.controller;

import com.maapiid.tutorial.simplerest.model.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "/")
@Api(value = "Products Management System")
public interface ProductControllerApi {
    @ApiOperation(value = "View a root api endpoint", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved message"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 500, message = "Some unknown server error")
    })
    @GetMapping(value = "/")
    String home();

    @ApiOperation(value = "View a list of products", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
            @ApiResponse(code = 500, message = "Some unknown server error")
    })
    @GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Product> getProducts();
}
