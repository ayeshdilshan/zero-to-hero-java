package com.everything_in_java.learning.springDataJpaMapping.controller;

import com.everything_in_java.learning.springDataJpaMapping.dto.OrderRequestDto;
import com.everything_in_java.learning.springDataJpaMapping.dto.OrderResponseDto;
import com.everything_in_java.learning.springDataJpaMapping.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity <OrderResponseDto> createOrder (@RequestBody @Valid OrderRequestDto dto) {
        OrderResponseDto orderResponseDto = orderService.createOrder(dto);
        return new ResponseEntity<>(orderResponseDto, HttpStatus.CREATED);
    }
}
