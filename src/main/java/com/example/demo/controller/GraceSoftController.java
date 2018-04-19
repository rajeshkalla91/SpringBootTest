package com.example.demo.controller;


import com.example.demo.model.GraceSoftSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class GraceSoftController {

    @Autowired
    GraceSoftSender graceSoftSender;

    @RequestMapping(value="/graceSoft", method = RequestMethod.POST)
    public String acceptRequest(@RequestBody String payload){
        String response = graceSoftSender.postToGraceSoft(payload);
        return response;
    }
}
