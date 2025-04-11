package com.hesus.apphb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hesus.apphb.models.Employee;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ContractController {

    @GetMapping("/employee")
    public Employee getEmployee() {
        return new Employee("Juan", "Rodriguez", "Street One", "Manager", 35, 4045271, 001);
    }
}
