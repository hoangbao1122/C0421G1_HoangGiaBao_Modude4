package com.example.thi.controller;

import com.example.thi.dto.ProductDto;
import com.example.thi.model.entity.product.OrderEntity;
import com.example.thi.model.entity.product.Product;
import com.example.thi.model.service.product.IOrderService;
import com.example.thi.model.service.product.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @Autowired
    private IOrderService iOrderService;

    @GetMapping("/list")
    public String findAll(Model model, @PageableDefault(value = 2) Pageable pageable) {
        model.addAttribute("listAll", this.iProductService.findAll(pageable));
        return "list";
    }

    @GetMapping("/create")
    public String saveForm(Model model) {
        List<OrderEntity> orderEntities = this.iOrderService.findAll();
        model.addAttribute("order", orderEntities);

        model.addAttribute("productDto", new ProductDto());

        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("productDto") @Valid ProductDto productDto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "create";
        }
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        this.iProductService.save(product);
        redirectAttributes.addFlashAttribute("messOk", "add " + product.getNameProduct() + " Success .");
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String remove(@RequestParam long id, RedirectAttributes redirectAttributes) {
        this.iProductService.remove(id);
        redirectAttributes.addFlashAttribute("messOk", "delete success .");
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable long id, Model model) {
        model.addAttribute("product", this.iProductService.findById(id));
        return "/edit";
    }

    @PostMapping
    public String edit(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        this.iProductService.save(product);
        redirectAttributes.addFlashAttribute("messOk", "edit Ok .");
        return "redirect:/list";
    }
}
