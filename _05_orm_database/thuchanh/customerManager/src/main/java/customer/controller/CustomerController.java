package customer.controller;

import customer.model.Service.ICustomerService;
import customer.model.repository.ICustomerRepository;
import customer.model.bean.Customer;
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
    private ICustomerService iProductService;

    @GetMapping("list")
    public String list(Model model) {
        model.addAttribute("listAll", iProductService.listAll());
        return "list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }
    @PostMapping("/create")
    public String save (Customer product){
        product.setId((int)(Math.random()*10000));
        iProductService.save(product);
        return "redirect:/list";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("customer",iProductService.findById(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String update(@ModelAttribute Customer customer){
        iProductService.update(customer);
        return "redirect:/list";
    }
    @GetMapping("/delete/{id}")
    public String delete(Customer customer, RedirectAttributes redirectAttributes, Model model, @PathVariable int id){
        model.addAttribute("customer",this.iProductService.findById(id));
        iProductService.delete(customer.getId());
        redirectAttributes.addFlashAttribute("success","remove successfully");
        return "redirect:/list";
    }
    @GetMapping("/search/{name}")
    public String search(@PathVariable String name,Model model){
        model.addAttribute("listAll",this.iProductService.search(name));
        return "list";
    }

}
