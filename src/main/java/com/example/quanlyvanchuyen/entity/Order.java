package com.example.quanlyvanchuyen.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "hello")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;

    @Column(name = "orderDate")
    private String orderDate;

    @Column(name = "deliveryDate")
    private String deliveryDate;

    @Column(name = "orderStatus")
    private String orderStatus;

    @Column(name = "totalAmount")
    private String totalAmount;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "paymentMethodID")
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "transportVehicle")
    private TransportVehicle transportVehicle;

    @ManyToOne
    @JoinColumn(name = "warehouse")
    private Warehouse warehouse;

}
