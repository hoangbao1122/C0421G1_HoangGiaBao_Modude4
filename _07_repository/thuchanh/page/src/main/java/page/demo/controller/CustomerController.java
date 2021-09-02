package page.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import page.demo.model.bean.Customer;
import page.demo.model.service.ICustomerService;



@Controller
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/list")
    public String findAll(@PageableDefault(value = 2) Pageable pageable, Model model) {
        Page<Customer> page = this.iCustomerService.findAll(pageable);
        model.addAttribute("listAll",page);
        return "list";
    }
    @GetMapping("/create")
    public String saveForm(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Customer customer,Model model){
        this.iCustomerService.save(customer);
        model.addAttribute("customer",customer);
        return "redirect:/list";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id,@ModelAttribute Customer customer,Model model){
        model.addAttribute("listAll",this.iCustomerService.findById(id));
        this.iCustomerService.delete(customer);
        return "redirect:/list";
    }
    @GetMapping("/search/{name}")
    public String search(@RequestParam String name, Model model, Pageable pageable){
        Page<Customer> page = this.iCustomerService.findAllByNameContaining(name,pageable);
        model.addAttribute("listAll",page);
        return "list";
    }
}
