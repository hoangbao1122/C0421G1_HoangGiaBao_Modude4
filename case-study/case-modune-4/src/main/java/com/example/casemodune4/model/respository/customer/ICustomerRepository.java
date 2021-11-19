package com.example.casemodune4.model.respository.customer;

import com.example.casemodune4.model.entity.customer.Customer;
import jdk.internal.net.http.common.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer>findByNameCusContaining(Pageable pageable,String name);
}
