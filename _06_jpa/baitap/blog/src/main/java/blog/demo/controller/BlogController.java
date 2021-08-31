package blog.demo.controller;

import blog.demo.model.bean.Blog;
import blog.demo.model.service.IBlogService;
import jdk.nashorn.internal.ir.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String save(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        this.iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("messageCreate", "add ok" + blog.getName());
        return "redirect:/list";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, @ModelAttribute Blog blog, Model model) {
        model.addAttribute("blog", this.iBlogService.findByid(id));
        this.iBlogService.delete(blog.getId());
        return "list";
    }
    @GetMapping("/edit/{id}")
    public String editshow(Model model,@PathVariable int id){
        model.addAttribute("blog",this.iBlogService.findByid(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog){
        this.iBlogService.update(blog);
        return "redirect:/list";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id,Model model){
        model.addAttribute("blog",this.iBlogService.findByid(id));
        return "detail";
    }
}
