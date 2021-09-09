package com.example.thuchanh.model.service;

import com.example.thuchanh.model.bean.Customer;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll();

    Optional<Customer> findById(int id);

    void save(Customer customer);

    void remove(int id);
}
