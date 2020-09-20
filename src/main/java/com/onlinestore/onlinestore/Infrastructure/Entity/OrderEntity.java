package com.onlinestore.onlinestore.Infrastructure.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDERS")
public class OrderEntity {

    @Id
    @Column(name = "ORDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderID;

    @Column(name = "ORDER_CODE")
    private String orderCode;

    @Column(name = "ORDER_ADDRESS")
    private String orderAddress;

    @Column(name = "TOTAL")
    private BigDecimal total;

    @Column(name = "DATE_ORDERED")
    private String dateOrder;

    @Column(name = "DATE_DELIVERED")
    private String dateDelivered;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "PAYMENT_METHOD")
    private String paymentMethod;

    @Column(name = "USER_ID")
    private int userID;
}