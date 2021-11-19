package managercustomer.customer.controller;

import model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("list")
    public String findAll(Model model) {
        model.addAttribute("listAll", this.iCustomerService.findAll());
        return "list";
    }
}
