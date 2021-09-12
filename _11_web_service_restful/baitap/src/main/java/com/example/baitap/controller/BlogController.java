package com.example.baitap.controller;

import com.example.baitap.model.bean.Blog;
import com.example.baitap.model.bean.Category;
import com.example.baitap.model.service.IBlogService;
import com.example.baitap.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("show-blog")
    public ResponseEntity<Iterable<Blog>> findAll() {
        List<Blog> list = (List<Blog>) this.iBlogService.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("detail-blog/{id}")
    public ResponseEntity<Optional<Blog>>findByid(@PathVariable long id){
        Optional<Blog>blog = this.iBlogService.findById(id);
        if (blog.isPresent()){
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
