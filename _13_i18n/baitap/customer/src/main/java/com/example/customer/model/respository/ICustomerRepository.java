package com.example.customer.model.respository;

import com.example.customer.model.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}
