package com.example.quanlyvanchuyen.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productID;

    @Column(name = "productName")
    private String productName;

    @Column(name = "unitPrice")
    private String unitPrice;

    @Column(name = "unitsInStock")
    private int unitsInStock;

    @ManyToOne
    @JoinColumn(name = "categoryID")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "orderDetailID")
    private OrderDetail orderDetail;


}
