package product.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import product.model.repository.IProductRepository;
import product.model.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import product.model.service.IProductService;


@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("list")
    public String list(Model model) {
        model.addAttribute("listAll", iProductService.listAll());
        return "list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/create")
    public String save (Product product){
        product.setId((int)(Math.random()*10000));
        iProductService.save(product);
        return "redirect:/list";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String update(@ModelAttribute Product product){
        iProductService.update(product);
        return "redirect:list";
    }
    @GetMapping("/delete/{id}")
    public String delete(Product product, RedirectAttributes redirectAttributes,Model model,@PathVariable int id){
        model.addAttribute("product",this.iProductService.findById(id));
        iProductService.delete(product.getId());
        redirectAttributes.addFlashAttribute("success","remove successfully");
        return "redirect:/list";
    }
    @GetMapping("/search/{name}")
    public String search(@PathVariable String name,Model model){
        model.addAttribute("listAll",this.iProductService.search(name));
        return "list";
    }

}
