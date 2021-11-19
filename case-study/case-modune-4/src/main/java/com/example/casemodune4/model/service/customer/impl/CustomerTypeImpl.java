package com.example.casemodune4.model.service.customer.impl;

import com.example.casemodune4.model.entity.customer.CustomerType;
import com.example.casemodune4.model.respository.customer.ICustomerTypeRepository;
import com.example.casemodune4.model.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerTypeImpl implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return this.iCustomerTypeRepository.findAll();
    }

    @Override
    public void save(CustomerType customerType) {

    }

    @Override
    public Optional<CustomerType> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public void update(CustomerType customerType) {

    }

    @Override
    public Page<CustomerType> search(Pageable pageable, String name) {
        return null;
    }
}
