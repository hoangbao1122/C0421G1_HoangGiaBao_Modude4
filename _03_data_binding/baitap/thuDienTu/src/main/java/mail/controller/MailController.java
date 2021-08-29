package mail.controller;

import mail.model.bean.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MailController {
    @GetMapping("/create")
    public String showFormCreate(Model model){
        List<String>language = new ArrayList<>();
        language.add("viet nam");
        language.add("english");
        language.add("lao");
        List<Integer>size = new ArrayList<>();
        size.add(5);
        size.add(10);
        size.add(15);
        size.add(20);
        Mail mail = new Mail();
        model.addAttribute("mail",mail);
        model.addAttribute("language",language);
        model.addAttribute("size",size);
        return "create";

    }
    @PostMapping("/create")
    public String create( @ModelAttribute Mail mail , RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","them thanh cong");
        return "redirect:/create";
    }
}
