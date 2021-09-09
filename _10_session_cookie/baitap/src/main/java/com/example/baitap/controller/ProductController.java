package com.example.baitap.controller;

import com.example.baitap.model.dto.CardDto;
import com.example.baitap.model.dto.ProductDto;
import com.example.baitap.model.entity.Product;
import com.example.baitap.model.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@SessionAttributes("card")
@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @ModelAttribute("card")
    public CardDto cardDto() {
        return new CardDto(); // tao gia tri mac dinh cho session gia tri rong
    }

    @GetMapping("/shop")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("products", this.iProductService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addCard(@PathVariable Long id, @SessionAttribute CardDto card) {  // ! cai thang card pai cung ten vs cai @session treen kia
        Optional<Product> productOptional = this.iProductService.findById(id);
        if (productOptional.isPresent()) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productOptional.get(), productDto);
            card.addProduct(productDto);

        }
        return "redirect:/shop";
    }

    @GetMapping("/detail/{id}")
    public ModelAndView showDetail(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("product/detailProduct");
        modelAndView.addObject("product", this.iProductService.findById(id).get());
        return modelAndView;
    }

    @GetMapping("deleteCard/{id}")
    public String removeCard(@PathVariable long id, @SessionAttribute CardDto card) {
        Optional<Product> productOptional = this.iProductService.findById(id);
        if (productOptional.isPresent()) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productOptional.get(), productDto);
            card.delete(productDto);
        }
        return "redirect:/shop-card";
    }

    @GetMapping("/price")
    public String tinhTien(@SessionAttribute CardDto card) {
        Iterable<Product> productOptional = this.iProductService.findAll();
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productOptional, productDto);
        card.deleteCard(productDto);
        return "redirect:/shop";
    }
}
