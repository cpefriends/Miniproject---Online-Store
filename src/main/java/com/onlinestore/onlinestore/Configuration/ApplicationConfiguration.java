package com.onlinestore.onlinestore.Configuration;

import com.onlinestore.onlinestore.Core.Service.ProductService;
import com.onlinestore.onlinestore.Core.Service.Impl.ProductServiceImplementation;
import com.onlinestore.onlinestore.Infrastructure.Repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    ProductService productService(ProductRepository productRepository) {
        return new ProductServiceImplementation(productRepository);
    }
}
