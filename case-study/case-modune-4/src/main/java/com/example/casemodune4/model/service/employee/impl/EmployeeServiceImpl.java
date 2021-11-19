package com.example.casemodune4.model.service.employee.impl;

import com.example.casemodune4.model.entity.emp.Employee;
import com.example.casemodune4.model.respository.emp.IEmployeeRespository;
import com.example.casemodune4.model.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private IEmployeeRespository iEmployeeRespository;

    @Override
    public List<Employee> findAll() {
        return this.iEmployeeRespository.findAll();
    }

    @Override
    public void save(Employee employee) {
        this.iEmployeeRespository.save(employee);
    }

    @Override
    public Optional<Employee> findById(long id) {
        return this.iEmployeeRespository.findById(id);
    }

    @Override
    public void update(Employee employee) {
        this.iEmployeeRespository.save(employee);
    }

    @Override
    public Page<Employee> search(Pageable pageable, String name) {
        return null;
    }

    @Override
    public void remove(long id) {
        this.iEmployeeRespository.deleteById(id);
    }
}
