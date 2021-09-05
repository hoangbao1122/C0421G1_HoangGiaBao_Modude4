package validateformregister.demo.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import validateformregister.demo.dto.UserDto;
import validateformregister.demo.model.entity.User;
import validateformregister.demo.model.service.IUserService;


@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/listUser")
    public String findAll(Model model) {
        model.addAttribute("listAll", this.iUserService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String saveForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute @Validated UserDto userDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        this.iUserService.save(user);
        model.addAttribute("user", user);
        return "redirect:/listUser";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, @ModelAttribute User user, Model model) {
        model.addAttribute("user", this.iUserService.findByid(id));
        this.iUserService.delete(user);
        return "redirect:/listUser";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("userDto", this.iUserService.findByid(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute UserDto userDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "/edit";
        } else {
            model.addAttribute("userDto", userDto);
            User user = new User();
            BeanUtils.copyProperties(userDto, user);
            this.iUserService.update(user);
            model.addAttribute("user", user);
            return "redirect:/listUser";
        }
    }
}
