package com.onlinestore.onlinestore.Core.Service.Impl;

import com.onlinestore.onlinestore.Core.Service.ProductService;
import com.onlinestore.onlinestore.Infrastructure.Entity.ProductEntity;
import com.onlinestore.onlinestore.Infrastructure.Repository.ProductRepository;
import com.onlinestore.onlinestore.Presentation.DTO.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> getAll() {
        List<ProductDTO> productDTOList = null;

        List<ProductEntity> productEntities = productRepository.findAll();

        for (ProductEntity productEntity : productEntities) {
            productDTOList.add(
                    ProductDTO.builder().productID(productEntity.getProductID())
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
        return productDTOList;
    }
}

