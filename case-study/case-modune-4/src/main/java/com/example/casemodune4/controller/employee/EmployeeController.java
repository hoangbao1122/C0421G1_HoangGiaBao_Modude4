package com.example.casemodune4.controller.employee;

import com.example.casemodune4.model.entity.emp.Division;
import com.example.casemodune4.model.entity.emp.EducationDegree;
import com.example.casemodune4.model.entity.emp.Employee;
import com.example.casemodune4.model.entity.emp.Position;
import com.example.casemodune4.model.entity.user.User;
import com.example.casemodune4.model.service.employee.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private IPositionService iPositionService;

    @Autowired
    private IDivisionService iDivisionService;

    @Autowired
    private IEducationDegreeService iEducationDegreeService;

    @Autowired
    private IUserService iUserService;
    @GetMapping(value = "/list")
    public ModelAndView findAll() {
        return new ModelAndView("emp/list", "listAll", this.iEmployeeService.findAll());
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        List<Position> positionList = this.iPositionService.findAll();
        model.addAttribute("pos", positionList);

        List<EducationDegree> educationDegreeList = this.iEducationDegreeService.findAll();
        model.addAttribute("edu", educationDegreeList);

        List<Division> divisionList = this.iDivisionService.findAll();
        model.addAttribute("division", divisionList);

        List<User> users = this.iUserService.findAll();
        model.addAttribute("user",users);

        model.addAttribute("emp", new Employee());
        return "emp/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("emp") Employee employee) {
        this.iEmployeeService.save(employee);
        return "redirect:/employee/list";
    }

    @GetMapping("/delete/{id}")
    public String remove(@PathVariable long id,@ModelAttribute Employee employee) {
        this.iEmployeeService.remove(id);
        return "redirect:/employee/list";
    }
}
