package com.example.blog.controller;
import com.example.blog.model.bean.Blog;
import com.example.blog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping()
    public ResponseEntity<Page<Blog>> findAll(@PageableDefault(value = 3) Pageable pageable ) {
        Page<Blog> blogs = this.iBlogService.findAll(pageable);
        if (blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("list")
    public ModelAndView listAll(@PageableDefault(value = 3) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("listAll",this.iBlogService.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("/search")
    public ResponseEntity<List<Blog>> search(@RequestParam String searchBlog) {
        List<Blog> page = this.iBlogService.findAllByNameContaining(searchBlog);

        if (page.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(page,HttpStatus.OK);
    }
}
