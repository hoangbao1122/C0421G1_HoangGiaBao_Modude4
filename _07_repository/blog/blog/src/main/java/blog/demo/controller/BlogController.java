package blog.demo.controller;

import blog.demo.model.bean.Blog;
import blog.demo.model.service.IBlogService;
import blog.demo.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;


@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/list")
    public String findAll(@PageableDefault(value = 3) Pageable pageable, Model model) {
        Page<Blog> blogs = this.iBlogService.findAll(pageable);
        model.addAttribute("listAll", blogs);
        model.addAttribute("category", this.iCategoryService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String saveForm(Model model) {
        model.addAttribute("listCategory", this.iCategoryService.findAll());
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog, Model model) {

        LocalDate localDate = blog.setDate(LocalDate.now());

        this.iBlogService.save(blog);
        model.addAttribute("blog", blog);
//        redirectAttributes.addFlashAttribute("messageCreate", "add ok" + blog.getName());
        return "redirect:/list";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, @ModelAttribute Blog blog, Model model) {
        model.addAttribute("listAll", this.iBlogService.findByid(id));
        this.iBlogService.delete(blog);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String editshow(Model model, @PathVariable int id) {
        model.addAttribute("blog", this.iBlogService.findByid(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog) {
        this.iBlogService.update(blog);
        return "redirect:/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id, Model model) {
        model.addAttribute("blog", this.iBlogService.findByid(id));
        return "detail";
    }

    @GetMapping("search")
    public String search(@RequestParam String searchBlog, Model model,Pageable pageable) {
        Page<Blog> page = this.iBlogService.findAllByNameContaining(searchBlog,pageable);
        model.addAttribute("listAll",page);
        return "list";
    }
}
