package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/caculator")
    public String show() {
        return "list";
    }

    @GetMapping("/result")
    public String result(@RequestParam int number1, @RequestParam int number2,@RequestParam String phepToan, Model model) {
        int result;
        switch (phepToan){
            case "Addition":
                result = number1 + number2;
                model.addAttribute("result", result);
                break;
            case "Subtraction":
                result = number1 - number2;
                model.addAttribute("result",result);
                break;
            case "Multiplication":
                result = number1 * number2;
                model.addAttribute("result",result);
                break;
            case "Division":
                result = number1 / number2;
                model.addAttribute("result",result);
                break;
        }

        return "list";
    }
}
