package com.example.thuchanh.model.repository;

import com.example.thuchanh.model.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
}
