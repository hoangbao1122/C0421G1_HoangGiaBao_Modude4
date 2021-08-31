package c0421g1_hoanggiabao_modude4.customer.controller;

import c0421g1_hoanggiabao_modude4.customer.model.bean.Customer;
import c0421g1_hoanggiabao_modude4.customer.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/list")
    public String findAll(Model model) {
        model.addAttribute("listAll", this.iCustomerService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String formSave(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/create")
    public String save(Customer customer) {
        customer.setId((int) (Math.random() * 10000));
        this.iCustomerService.save(customer);
        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@ModelAttribute Customer customer, @PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
        model.addAttribute("customer", this.iCustomerService.findById(id));
        this.iCustomerService.delete(customer.getId());
        redirectAttributes.addFlashAttribute("message","delete ok");
        return "redirect:/list";
    }
    @GetMapping("/edit/{id}")
    public String showEdit(Model model,@PathVariable int id){
        model.addAttribute("customer",this.iCustomerService.findById(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Customer customer){
        this.iCustomerService.update(customer);
        return "redirect:list";
    }
}
