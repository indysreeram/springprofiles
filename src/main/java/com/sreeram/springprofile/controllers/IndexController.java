package com.sreeram.springprofile.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${spring.message}")
    private String message;

    @RequestMapping({"/","/message"})
    public String getMessage(){
        System.out.println(message);
        return message;
    }

}
