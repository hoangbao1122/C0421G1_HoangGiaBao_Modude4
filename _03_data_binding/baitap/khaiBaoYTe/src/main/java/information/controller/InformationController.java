package information.controller;

import information.modal.bean.Information;
import information.modal.repository.IInformationRepository;
import information.modal.repository.Impl.InformationRepositoryImpl;
import information.modal.service.IInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class InformationController {
    @Autowired
    private IInformationService iInformationService;

    @GetMapping("create")
    public String showForm() {
        return "create";
    }
    @PostMapping("create")
    public String create(@ModelAttribute Information information,Model model,RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","add ok");
        return "redirect/create";
    }
}
