package com.example.quanlyvanchuyen.service.serviceimpl;

import com.example.quanlyvanchuyen.DTO.Orderdto;
import com.example.quanlyvanchuyen.entity.Customer;
import com.example.quanlyvanchuyen.entity.Order;
import com.example.quanlyvanchuyen.error.DataNotFoundException;
import com.example.quanlyvanchuyen.repository.CustomerRepository;
import com.example.quanlyvanchuyen.repository.OrderRepository;
import com.example.quanlyvanchuyen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;
    CustomerRepository customerRepository;

    @Override
    public List<Order> listOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order addOrder(Orderdto orderdto) {
        Order order1 = new Order();
        Customer customer = customerRepository.findById(orderdto.getCustomerID()).orElseThrow(() -> new DataNotFoundException("Customer not found"));
        order1.setCustomer(customer);
        order1.setDeliveryDate(orderdto.getDeliveryDate());
        order1.setOrderDate(orderdto.getOrderDate());
        order1.setOrderStatus(orderdto.getOrderStatus());
        order1.setTotalAmount(orderdto.getTotalAmount());

        orderRepository.save(order1);
        return order1;
    }

    @Override
    public Order updateOrder(Orderdto orderdto, Long id) {
        return null;
    }

    @Override
    public boolean deleteOrder(Long id) {
        return false;
    }
}
