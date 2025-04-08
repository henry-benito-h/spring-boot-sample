package com.hesus.apphb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hesus.apphb.models.Employee;

@Controller
public class ExampleController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        Employee employee1 = new Employee("Juan", "Rodriguez", "Street One", "Manager", 35, 4045271, 001);
        model.addAttribute("EmployeeHB", employee1);
        return "detalles_info";
    }

}
