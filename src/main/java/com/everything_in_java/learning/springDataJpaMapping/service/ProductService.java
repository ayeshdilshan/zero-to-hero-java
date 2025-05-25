package com.everything_in_java.learning.springDataJpaMapping.service;

import com.everything_in_java.learning.springDataJpaMapping.dto.ProductResponseDto;
import com.everything_in_java.learning.springDataJpaMapping.model.Product;
import com.everything_in_java.learning.springDataJpaMapping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class ProductService {

    private static final String IMAGE_DIR = "product-images/";

    @Value("&{product.image.upload.dir}")
    private String uploadDir;

    @Autowired
    private ProductRepository productRepository;

    public ProductResponseDto saveProduct(String name, BigDecimal price, MultipartFile imageFile) throws IOException {

        // Generate safe filename
        String fileName = UUID.randomUUID() + "_" + StringUtils.cleanPath(imageFile.getOriginalFilename());
        Path imagePath = Paths.get(uploadDir + File.separator + fileName);

        // Create directory if it doesn't exist
        Files.createDirectories(imagePath.getParent());

        // Save file to disk
        Files.copy(imageFile.getInputStream(), imagePath, StandardCopyOption.REPLACE_EXISTING);

        // Save product
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setImagePath(IMAGE_DIR + fileName);  // relative path for web access

        Product saved = productRepository.save(product);
        return new ProductResponseDto(saved);
    }
}
