package com.example.thuchanh.controller;

import com.example.thuchanh.model.bean.Customer;
import com.example.thuchanh.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping
    public ResponseEntity<Iterable<Customer>>findAll(){
        List<Customer> list = (List<Customer>) this.iCustomerService.findAll();
        if (list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
       return new ResponseEntity<>(this.iCustomerService.save(customer),HttpStatus.CREATED);
    }


}
