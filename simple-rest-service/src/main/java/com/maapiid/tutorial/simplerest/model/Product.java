package com.maapiid.tutorial.simplerest.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@ApiModel(description = "All details about the Product.")
@EntityScan
public class Product {
    @ApiModelProperty(notes = "The product ID")
    private long id;
    @ApiModelProperty(notes = "The product name")
    private String name;
    @ApiModelProperty(notes = "The product description")
    private String description;

    public Product(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
