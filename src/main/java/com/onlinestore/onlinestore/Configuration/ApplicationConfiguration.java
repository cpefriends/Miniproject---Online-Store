package com.onlinestore.onlinestore.Configuration;

import com.onlinestore.onlinestore.Core.Service.ProductService;
import com.onlinestore.onlinestore.Core.Service.Impl.ProductServiceImplementation;
import com.onlinestore.onlinestore.Infrastructure.Repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ApplicationConfiguration {

    @Bean
    ProductService productService(ProductRepository productRepository) {
        return new ProductServiceImplementation(productRepository);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer()
    {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:8080");
            }
        };
    }
}
