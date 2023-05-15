package com.example.quanlyvanchuyen.service;

import com.example.quanlyvanchuyen.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer>listCustomer();
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Customer customer, Long id);
    void deleteCustomer(Long id);

}
