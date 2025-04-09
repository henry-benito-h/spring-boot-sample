package com.hesus.apphb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hesus.apphb.models.Employee;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @Value("${config.user}")
    private String user;
    @Value("${config.code}")
    private int code;
    @Value("${config.message}")
    private String message;
    @Value("${config.values}")
    private String[] values;
    

    @GetMapping("/page1/{message}")
    public ParameterDTO getPage1(@PathVariable String message) {
        ParameterDTO param1 = new ParameterDTO();
        param1.setInformation(message);
        return param1;
    }

    @PostMapping("/request")
    public Employee createEmployee(@RequestBody Employee employee1) {
        return employee1;
    }

    /**
     * I will get values from application.properties file
     * @return
     */
    @GetMapping("/values")
    public Map<String, Object> values() {
        Map<String, Object> result = new HashMap<>();
        result.put("user:", user);
        result.put("code:", code);
        result.put("message:", message);
        result.put("values:", values);
        return result;
    }
    
    
}
