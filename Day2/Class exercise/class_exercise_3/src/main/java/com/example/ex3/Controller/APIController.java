package com.example.ex3.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex3.Model.Student;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class APIController 
{
    @GetMapping("/path")
    public Student getMethodName() {
        return new Student("Mounish",111,"THIS IS A DESCRIPTION");
    }
}