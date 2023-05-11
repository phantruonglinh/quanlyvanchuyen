package com.example.quanlyvanchuyen.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

@Getter
@Setter
public class Warehouse {

    private Long warehouseID;

    private String warehouseName;

    private String Aadress;
}
