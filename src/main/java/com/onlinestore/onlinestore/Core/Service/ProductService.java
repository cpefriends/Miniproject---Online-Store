package com.onlinestore.onlinestore.Core.Service;

import com.onlinestore.onlinestore.Core.Product;
import com.onlinestore.onlinestore.Presentation.DTO.ProductDTO;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    String createProduct(ProductDTO productDTO);
}
