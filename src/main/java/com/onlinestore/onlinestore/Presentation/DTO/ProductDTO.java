package com.onlinestore.onlinestore.Presentation.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private long productID;
    private String productName;
    private String productCode;
    private BigDecimal productPrice;
    private String productDescription;
    private String productThumbnail;
    private int productHidden;
    private BigDecimal totalSales;
    private int productStock;
}
