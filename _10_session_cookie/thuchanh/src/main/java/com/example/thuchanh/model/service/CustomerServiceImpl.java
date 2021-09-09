package com.example.thuchanh.model.service;

import com.example.thuchanh.model.bean.Customer;
import com.example.thuchanh.model.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerServiceImpl implements ICustomerService {
@Autowired
private ICustomerRepository iCustomerRepository;
    @Override
    public Iterable<Customer> findAll() {
        return this.iCustomerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(int id) {
        return this.iCustomerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        this.iCustomerRepository.save(customer);
    }

    @Override
    public void remove(int id) {
    this.iCustomerRepository.deleteById(id);
    }
}
