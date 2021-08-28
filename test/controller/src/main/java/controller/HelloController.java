package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HelloController {
    @RequestMapping("/")
    public String hadle(Model model){
        model.addAttribute("hello","xin chào");
        return "/home";
    }
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message","home");
        return "/index";
    }
}
