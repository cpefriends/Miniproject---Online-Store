package com.onlinestore.onlinestore.Presentation;

import com.onlinestore.onlinestore.Core.Service.ProductService;
import com.onlinestore.onlinestore.Presentation.DTO.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    private ProductService productService;

    @GetMapping(value = "getAll")
    public List<ProductDTO> getAllProducts() {
        return productService.getAll();
    }

    @GetMapping(value = "print")
    public String getMssage() {
        return "ASDA";
    }

}
