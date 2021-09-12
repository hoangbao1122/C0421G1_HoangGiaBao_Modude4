package com.example.customer.model.service;

import com.example.customer.model.bean.Customer;
import com.example.customer.model.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ICustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return this.iCustomerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return this.iCustomerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return this.iCustomerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        this.iCustomerRepository.deleteById(id);
    }
}
