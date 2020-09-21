package com.onlinestore.onlinestore.Core.Service.Impl;

import com.onlinestore.onlinestore.Core.Product;
import com.onlinestore.onlinestore.Core.Service.ProductService;
import com.onlinestore.onlinestore.Infrastructure.Entity.ProductEntity;
import com.onlinestore.onlinestore.Infrastructure.Repository.ProductRepository;
import com.onlinestore.onlinestore.Presentation.DTO.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<Product>();

        List<ProductEntity> productEntities = productRepository.findAll();

        for (ProductEntity productEntity : productEntities) {
            productList.add(
                    Product.builder().productID(productEntity.getProductID())
                    .productName(productEntity.getProductName())
                    .productPrice(productEntity.getProductPrice())
                    .productDescription(productEntity.getProductDescription())
                    .productThumbnail(productEntity.getProductThumbnail())
                    .productHidden(productEntity.getProductHidden())
                    .totalSales(productEntity.getTotalSales())
                    .productStock(productEntity.getProductStock())
                    .build()
            );
        }
        return productList;
    }

    @Override
    public String createProduct(ProductDTO productDTO) {
        ProductEntity productEntity = new ProductEntity();

        productEntity.setProductName(productDTO.getProductName());
        productEntity.setProductCode(productDTO.getProductCode());
        productEntity.setProductPrice(productDTO.getProductPrice());
        productEntity.setProductDescription(productDTO.getProductDescription());
        productEntity.setProductThumbnail(productDTO.getProductThumbnail());
        productEntity.setProductStock(0);
        productEntity.setTotalSales(BigDecimal.valueOf(0));
        productEntity.setProductStock(0);

        productRepository.save(productEntity);

        return "Added";
    }

    @Override
    public String updateProduct(ProductDTO productDTO) {
        ProductEntity productEntity = productRepository.findById(productDTO.getProductID());

        productEntity.setProductName(productDTO.getProductName());
        productEntity.setProductCode(productDTO.getProductCode());
        productEntity.setProductPrice(productDTO.getProductPrice());
        productEntity.setProductDescription(productDTO.getProductDescription());
        productEntity.setProductThumbnail(productDTO.getProductThumbnail());
        productEntity.setProductStock(productDTO.getProductStock());
        productEntity.setTotalSales(productDTO.getTotalSales());
        productEntity.setProductStock(productDTO.getProductStock());

        productRepository.save(productEntity);

        return "Updated";
    }
}