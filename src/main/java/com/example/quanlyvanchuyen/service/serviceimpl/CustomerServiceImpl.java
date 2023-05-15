package com.example.quanlyvanchuyen.service.serviceimpl;

import com.example.quanlyvanchuyen.entity.Customer;
import com.example.quanlyvanchuyen.repository.CustomerRepository;
import com.example.quanlyvanchuyen.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> listCustomer() {
        return customerRepository.findAll();

    }

    @Override
    public Customer addCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer, Long id) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }
}
