package com.italloramon.spring_shop.dto;

import com.italloramon.spring_shop.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {
    private Long id;

    @NotBlank(message = "Required field")
    @Size(min= 3, max = 80, message = "Name must have 3 to 80 characters")
    private String name;

    @NotBlank(message = "Required field")
    @Size(min= 10, message = "Description must have the minimum of 10 characters")
    private String description;

    @Positive(message = "Price must have be a positive number")
    private Double price;

    private String imgUrl;

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
        imgUrl = product.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
