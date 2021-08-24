package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SanwichController {
@GetMapping("sanwich")
public String getSanwich(){
    return "list";
}
@GetMapping("save")
    public String saveSanwich(Model model, @RequestParam String sanwich){
    model.addAttribute("save",sanwich);
    return "list";
}

}
