package validateforminput.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import validateforminput.demo.model.bean.User;

@Controller
public class UserController {
    @GetMapping("/user")
    public String userForm(Model model){
        model.addAttribute("user",new User());
        return "index";
    }
    @PostMapping("/validate")
    public String checkValidate(@Validated @ModelAttribute("user") User user, BindingResult bindingResult,Model model){
        if (bindingResult.hasFieldErrors()){
            return "index";
        }else {
            return "result";
        }
    }
}
