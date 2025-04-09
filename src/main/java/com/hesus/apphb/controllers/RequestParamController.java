package com.hesus.apphb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/parameters")
public class RequestParamController {

    @GetMapping("/details")
    public ParameterDTO details(@RequestParam(required = false) String information) {
        ParameterDTO param1 = new ParameterDTO();
        param1.setInformation(information);
        return param1;
    }
}
