package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class Traslate {
    @PostMapping("/translate")
    public ModelAndView result(@RequestParam String englist) {

        String[] str1 = {"tên", "lớp","ăn","xin chào"};
        String[] str2 = {"name", "class","eat", "hello"};
        String result = "";
        boolean check = false;
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (englist.equals(str1[i])){
                    result = str2[j];
                    check = true;
                }
            }
        }
        if (!check){
            result = "ko có từ này trong danh sách";
        }

        ModelAndView modelAndView = new ModelAndView("translate");
        modelAndView.addObject("translateEnglish", result);
        return modelAndView;
    }

    @GetMapping("/translate")
    public String translate() {
        return "translate";
    }
}
