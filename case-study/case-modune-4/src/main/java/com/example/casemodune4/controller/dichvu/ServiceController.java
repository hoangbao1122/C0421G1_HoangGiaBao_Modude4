package com.example.casemodune4.controller.dichvu;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.example.casemodune4.dto.ServiceDto;
import com.example.casemodune4.model.entity.dichvu.RentType;
import com.example.casemodune4.model.entity.dichvu.ServiceEntity;
import com.example.casemodune4.model.entity.dichvu.ServiceType;
import com.example.casemodune4.model.service.dichvu.IRendTypeService;
import com.example.casemodune4.model.service.dichvu.IService;
import com.example.casemodune4.model.service.dichvu.ITypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private IService iService;

    @Autowired
    private ITypeService iTypeService;

    @Autowired
    private IRendTypeService iRendTypeService;

    @GetMapping("/list")
    public String findAll(@PageableDefault(value = 2) Pageable pageable, @RequestParam Optional<String> name, Model model) {
        String nameSearch = "";

        if (name.isPresent()){
            nameSearch = name.get();
        }
        Page<ServiceEntity>page = this.iService.search(pageable,nameSearch);
        model.addAttribute("listAll",page);
        model.addAttribute("nameSearch",nameSearch);
        return "service/list";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam long id){
        this.iService.remove(id);
        return "redirect:/service/list";
    }
    @GetMapping("/create")
    public String createForm(Model model){
        List<RentType> rentTypeList = this.iRendTypeService.findAll();
        model.addAttribute("rentList",rentTypeList);
        List<ServiceType>serviceTypeList = this.iTypeService.findAll();
        model.addAttribute("typeList",serviceTypeList);

        model.addAttribute("service",new ServiceDto());
        return "service/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("service") @Valid ServiceDto serviceDto, BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            List<RentType> rentTypeList = this.iRendTypeService.findAll();
            model.addAttribute("rentList",rentTypeList);
            List<ServiceType>serviceTypeList = this.iTypeService.findAll();
            model.addAttribute("typeList",serviceTypeList);

            return "service/create";
        }
        ServiceEntity serviceEntity = new ServiceEntity();
        BeanUtils.copyProperties(serviceDto,serviceEntity);
        this.iService.save(serviceEntity);
        return "redirect:/service/list";
    }

}
