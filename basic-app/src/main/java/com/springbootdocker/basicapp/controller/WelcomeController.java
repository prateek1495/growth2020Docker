package com.springbootdocker.basicapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String getHelloFromDocker(){
        return "Hello Spring boot from Docker ";
    }
}
