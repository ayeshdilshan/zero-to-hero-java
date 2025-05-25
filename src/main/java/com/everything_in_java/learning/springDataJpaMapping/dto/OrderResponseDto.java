package com.everything_in_java.learning.springDataJpaMapping.dto;

import com.everything_in_java.learning.springDataJpaMapping.model.Order;
import com.everything_in_java.learning.springDataJpaMapping.model.Product;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class OrderResponseDto {

    private Long orderId;
    private String userName;
    private List<String> productNames;
    private BigDecimal totalAmount;
    private LocalDateTime orderedAt;

    public OrderResponseDto(Order order) {
        this.orderId = order.getId();
        this.userName = order.getUser().getName();
        this.productNames = order.getProducts()
                .stream()
                .map(Product::getName)
                .toList();
        this.totalAmount = order.getProducts()
                .stream()
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        this.orderedAt = order.getOrderedAt();
    }
}
