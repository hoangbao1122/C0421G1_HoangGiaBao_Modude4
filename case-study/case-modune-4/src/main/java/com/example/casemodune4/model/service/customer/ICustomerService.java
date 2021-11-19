package com.example.casemodune4.model.service.customer;

import com.example.casemodune4.model.entity.customer.Customer;
import com.example.casemodune4.model.service.IGenericFurama;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICustomerService  {
    Page<Customer> findAll(Pageable pageable);
    void save(Customer customer);
    Optional<Customer> findById(long id);
    void remove(long id);
    void update(Customer customer);
    Page<Customer>search(Pageable pageable,String name);
}
