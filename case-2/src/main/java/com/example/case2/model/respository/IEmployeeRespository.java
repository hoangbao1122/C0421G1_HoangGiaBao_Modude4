package com.example.case2.model.respository;

import com.example.case2.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRespository extends JpaRepository<Employee,Long> {
}
