package com.example.casemodune4.model.respository.customer;

import com.example.casemodune4.model.entity.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Long> {
}
