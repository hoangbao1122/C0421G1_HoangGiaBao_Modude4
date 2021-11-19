package com.example.casemodune4.model.respository.emp;

import com.example.casemodune4.model.entity.emp.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRespository extends JpaRepository<Employee,Long> {
}
