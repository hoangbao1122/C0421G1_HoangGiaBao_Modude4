package com.example.book.controller;

import com.example.book.model.bean.Book;
import com.example.book.model.bean.BorrowBook;
import com.example.book.model.service.IBookService;
import com.example.book.model.service.IBorrowBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class BookController {
    @Autowired
    private IBookService iBookService;

    @Autowired
    private IBorrowBookService iBorrowBookService;

    @GetMapping("/list")
    public ModelAndView listBook() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("listAll", this.iBookService.findAll());
        return modelAndView;
    }

    @GetMapping("create")
    public ModelAndView createForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("book", new Book());
        return modelAndView;
    }

    @PostMapping("create")
    public ModelAndView create(@ModelAttribute Book book) {
        this.iBookService.save(book);
        ModelAndView modelAndView = new ModelAndView("redirect:/list");
        return modelAndView;
    }

    @GetMapping("borrowBook/{id}")
    public ModelAndView ViewMuonBook(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/viewMuon");
        modelAndView.addObject("muon", this.iBookService.findById(id));
        return modelAndView;
    }

    @PostMapping("/borrowBook")
    public ModelAndView muon(@ModelAttribute Book book) {
        ModelAndView modelAndView = new ModelAndView("redirect:/list");
        int random = (int) (Math.random() * 89999) + 10000;
        book.setQuantity(book.getQuantity() - 1);
        this.iBookService.update(book);
        BorrowBook borrowBook = new BorrowBook();
        borrowBook.setId(random);
        borrowBook.setBook(book);
        this.iBorrowBookService.save(borrowBook);
        return modelAndView;
    }

    @GetMapping("traBook/{id}")
    public ModelAndView viewTra(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/viewTra");
        modelAndView.addObject("tra", this.iBookService.findById(id));
        return modelAndView;
    }


    @PostMapping("/TraBorrowBook")
    public ModelAndView tra(@ModelAttribute Book book, @RequestParam int codeBorrowBook) {
        this.iBorrowBookService.delete(codeBorrowBook);
        book.setQuantity(book.getQuantity() + 1);
        this.iBookService.update(book);
        return new ModelAndView("redirect:/list");
    }
    @ExceptionHandler(Exception.class)
    public String showViewError(){
        return "error";
    }

}

