package com.hesus.apphb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.hesus.apphb.models.Employee;

@Controller
public class ExampleController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        Employee employee1 = new Employee("Juan", "Rodriguez", "Street One", "Manager", 35, 4045271, 001);
        model.addAttribute("EmployeeHB", employee1);
        return "detalles_info";
    }

    @ModelAttribute("EmployeesList")
    public List<Employee> employeesList() {
        return Arrays.asList(
                new Employee("María", "Perez", "Calle segunda no.2", "Secretaria", 20, 123654987, 02),
                new Employee("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, 123456789, 01),
                new Employee("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, 987654321, 03),
                new Employee("Ana", "González", "Avenida central no.4", "Diseñadora", 30, 456789123, 04),
                new Employee("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, 789123456, 05));
    }

}
