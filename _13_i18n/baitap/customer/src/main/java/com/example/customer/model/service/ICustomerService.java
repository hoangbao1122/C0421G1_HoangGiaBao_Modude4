package com.example.customer.model.service;

import com.example.customer.model.dto.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer>findAll();
    void save(Customer customer);
}
