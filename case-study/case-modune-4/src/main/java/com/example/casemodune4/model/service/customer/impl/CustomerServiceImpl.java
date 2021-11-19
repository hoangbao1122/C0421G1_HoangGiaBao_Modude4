package com.example.casemodune4.model.service.customer.impl;

import com.example.casemodune4.model.entity.customer.Customer;
import com.example.casemodune4.model.respository.customer.ICustomerRepository;
import com.example.casemodune4.model.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return this.iCustomerRepository.findAll(pageable);
    }

    @Override
    public void save(Customer customer) {
        this.iCustomerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(long id) {
        return this.iCustomerRepository.findById(id);
    }

    @Override
    public void remove(long id) {
        this.iCustomerRepository.deleteById(id);
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public Page<Customer> search(Pageable pageable,String name) {
        return this.iCustomerRepository.findByNameCusContaining(pageable,name);
    }
}
