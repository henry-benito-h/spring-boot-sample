package com.hesus.apphb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hesus.apphb.models.Employee;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class ExampleRestController {

    @GetMapping("/detalles_info2")
    public Map<String, Object> info2() {
        Employee employee1 = new Employee("Juan", "Rodriguez", "Street One", "Manager", 35, 4045271, 001);
        Map<String, Object> response = new HashMap<>();
        response.put("Employee", "Employee Data");
        response.put("Information", employee1);
        return response;
    }

}
