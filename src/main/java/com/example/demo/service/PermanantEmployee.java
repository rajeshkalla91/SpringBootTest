package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PermanantEmployee implements EmployeeInterface{

    @Override
    public long getSalary() {
        return 10000;
    }

    @Override
    public String getJob() {
        return "Permanant Employee";
    }
}
