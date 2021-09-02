package blog.demo.controller;

import blog.demo.model.bean.Blog;
import blog.demo.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/list")
    public String findAll(Model model) {
        model.addAttribute("listAll", this.iBlogService.findAll());
        return "list";

    }

    @GetMapping("/create")
    public String saveForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog,Model model) {
        this.iBlogService.save(blog);
        model.addAttribute("blog",blog);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteBlog(Model model, @PathVariable int id, @ModelAttribute Blog blog) {
        model.addAttribute("listAll", this.iBlogService.findById(id));
        this.iBlogService.delete(blog);
        return "redirect:/list";
    }

}

