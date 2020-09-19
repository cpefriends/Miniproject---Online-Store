package com.onlinestore.onlinestore.Infrastructure.Repository;

import com.onlinestore.onlinestore.Infrastructure.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findAll();
}
