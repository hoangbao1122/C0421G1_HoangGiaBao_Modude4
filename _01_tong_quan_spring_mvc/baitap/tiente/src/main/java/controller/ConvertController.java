package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {
    @PostMapping("/convert")
    public ModelAndView money(@RequestParam String usd) {
        double tien = Double.parseDouble(usd) * 23000;
        ModelAndView modelAndView = new ModelAndView("convert");
        modelAndView.addObject("convertUsd", tien);
        return modelAndView;
    }
    @GetMapping("/convert")
    public String convert(){
        return "convert";
    }
}
