package com.everything_in_java.learning.springDataJpaMapping.service;

import com.everything_in_java.learning.springDataJpaMapping.dto.OrderRequestDto;
import com.everything_in_java.learning.springDataJpaMapping.dto.OrderResponseDto;
import com.everything_in_java.learning.springDataJpaMapping.model.Order;
import com.everything_in_java.learning.springDataJpaMapping.model.Product;
import com.everything_in_java.learning.springDataJpaMapping.model.User;
import com.everything_in_java.learning.springDataJpaMapping.repository.OrderRepository;
import com.everything_in_java.learning.springDataJpaMapping.repository.ProductRepository;
import com.everything_in_java.learning.springDataJpaMapping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    public OrderResponseDto createOrder (OrderRequestDto orderRequestDto) {
        User user = userRepository.findById(orderRequestDto.getUserId()) .orElseThrow(()-> new RuntimeException("User not found"));

        List<Product> products = productRepository.findAllById(orderRequestDto.getProductIds());
        if (products.isEmpty()) {
            throw new RuntimeException("No valid products found");
        }
        Order order = new Order();
        order.setUser(user);
        order.setProducts(products);

        Order saved = orderRepository.save(order);
        return new OrderResponseDto(saved);
    }

}
