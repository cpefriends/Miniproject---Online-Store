package com.onlinestore.onlinestore.Presentation;

import com.onlinestore.onlinestore.Core.Product;
import com.onlinestore.onlinestore.Core.Service.ProductService;
import com.onlinestore.onlinestore.Presentation.DTO.ProductDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping(value = "/getAll")
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @PostMapping(value = "/createProduct")
    public String getAllProducts(@RequestBody ProductDTO productDTO) {
        return productService.createProduct(productDTO);
    }

    @PutMapping(value = "/updateProduct")
    public String updateProduct(@RequestBody ProductDTO productDTO) {
        return productService.updateProduct(productDTO);
    }
}