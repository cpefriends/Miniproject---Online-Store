package com.onlinestore.onlinestore.Infrastructure.Entity;

import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCTS")
public class ProductEntity {

    @Column(name = "PRODUCT_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productID;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "PRODUCT_PRICE")
    private BigDecimal productPrice;

    @Column(name = "PRODUCT_DESCRIPTION")
    private String productDescription;

    @Column(name = "PRODUCT_THUMBNAIL")
    private String productThumbnail;

    @Column(name = "PRODUCT_HIDDEN")
    private int productHidden;

    @Column(name = "TOTAL_SALES")
    private BigDecimal totalSales;

    @Column(name = "PRODUCT_STOCK")
    private int productStock;
}
