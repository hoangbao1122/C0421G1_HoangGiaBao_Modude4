package com.example.baitap.controller;


import com.example.baitap.model.bean.Category;
import com.example.baitap.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("api/category")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/show-category")
    public ResponseEntity<Iterable<Category>> findAllCategory() {
        List<Category> list = (List<Category>) this.iCategoryService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/findCategory/{id}")
    public ResponseEntity<Optional<Category>> categoryList(@PathVariable long id) {
        Optional<Category> list = this.iCategoryService.findById(id);
        if (list.isPresent()) {
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
