package com.example.quanlyvanchuyen.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "transportVehicle")
public class TransportVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transportVehicleID;

    @Column(name = "driverName")
    private String driverName;

    @Column(name = "licensePlate")
    private String licensePlate;

    @Column(name = "vehicleType")
    private String vehicleType;

    @OneToMany(mappedBy = "transportVehicle")
    private List<Order> orders;

    @ManyToOne
    @JoinColumn(name = "batch")
    private Batch batch;
}
