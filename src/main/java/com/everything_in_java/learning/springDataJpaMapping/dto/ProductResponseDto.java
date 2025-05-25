package com.everything_in_java.learning.springDataJpaMapping.dto;

import com.everything_in_java.learning.springDataJpaMapping.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductResponseDto {

    private Long id;
    private String name;
    private BigDecimal price;
    private String imageUrl;

    public ProductResponseDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.imageUrl = product.getImagePath();
    }
}
