package com.example.customer.controller;

import com.example.customer.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping()
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("listAll",this.iCustomerService.findAll());
        return modelAndView;
    }
}
