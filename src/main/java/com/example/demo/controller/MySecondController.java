package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondController {

    @RequestMapping("/secondController")
    public String printSEcondController(){
        return "Hello My Dear second Controller......";
    }

}
