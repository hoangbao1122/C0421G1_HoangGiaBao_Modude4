package com.example.casemodune4.controller.customer;

import com.example.casemodune4.dto.CustomerDto;
import com.example.casemodune4.model.entity.customer.Customer;
import com.example.casemodune4.model.entity.customer.CustomerType;
import com.example.casemodune4.model.service.customer.ICustomerService;
import com.example.casemodune4.model.service.customer.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;

//    @GetMapping("/list")
//    public String findAll(Model model, @PageableDefault(value = 2) Pageable pageable) {
//        model.addAttribute("listAll", this.iCustomerService.findAll(pageable));
//        return "cus/list";
//    }

    @GetMapping("/create")
    public String saveForm(Model model) {
        List<CustomerType> customerTypes = this.iCustomerTypeService.findAll();
        model.addAttribute("cusType", customerTypes);

        model.addAttribute("customerDto", new CustomerDto());
        return "cus/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("customerDto") @Valid CustomerDto customerDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            List<CustomerType> list = this.iCustomerTypeService.findAll();
            model.addAttribute("cusType",list);
            return "cus/create";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        this.iCustomerService.save(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/delete")
    public String remove(@RequestParam long id) {
        this.iCustomerService.remove(id);
        return "redirect:/customer/list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable long id, Model model) {
        List<CustomerType> customerTypes = this.iCustomerTypeService.findAll();
        model.addAttribute("cusType", customerTypes);

        model.addAttribute("customer", this.iCustomerService.findById(id));
        return "cus/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Customer customer) {
        this.iCustomerService.save(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/list")
    public String listAndSearch(@PageableDefault(value = 2)Pageable pageable, @RequestParam Optional<String> name, Model model){
        String searchName = "";
        if (name.isPresent()){
            searchName = name.get();
        }
        Page<Customer> customers = this.iCustomerService.search(pageable,searchName);
        model.addAttribute("listAll",customers);
        model.addAttribute("nameSearch",searchName);
        return "cus/list";
    }
}
