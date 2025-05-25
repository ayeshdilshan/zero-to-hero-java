package com.everything_in_java.learning.springDataJpaMapping.controller;

import com.everything_in_java.learning.springDataJpaMapping.dto.ProductResponseDto;
import com.everything_in_java.learning.springDataJpaMapping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity <ProductResponseDto> createProduct (@RequestParam String name,
                                                              @RequestParam BigDecimal price,
                                                              @RequestPart MultipartFile imageFile) throws IOException {
        ProductResponseDto response = productService.saveProduct(name, price, imageFile);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }
}
