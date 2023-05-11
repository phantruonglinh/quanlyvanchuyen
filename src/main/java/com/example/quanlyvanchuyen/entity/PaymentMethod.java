package com.example.quanlyvanchuyen.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "paymentMethod")
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentMethodID;

    @Column(name = "paymentMethodName ")
    private String paymentMethodName;

    @OneToMany(mappedBy = "paymentMethod")
    private List<Order> orders;
}
