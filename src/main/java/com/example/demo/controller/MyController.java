package com.example.demo.controller;


import com.example.demo.model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class MyController {

    @Autowired
    private MyModel myModel;
    @RequestMapping(value = "/sayHello")
    public String sayHello(){
        myModel.setName("Hai Rajesh......");
        return myModel.toString();
    }

    @RequestMapping("/sayWorld")
    public String sayWorld(){
        return "Hellow World.........";
    }
    

}
