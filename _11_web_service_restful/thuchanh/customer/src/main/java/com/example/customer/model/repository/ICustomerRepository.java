package com.example.customer.model.repository;

import com.example.customer.model.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
