package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TemporaryEmployee implements EmployeeInterface{

    @Override
    public long getSalary() {
        return 5000;
    }

    @Override
    public String getJob() {
        return "Temporary Employee";
    }
}
