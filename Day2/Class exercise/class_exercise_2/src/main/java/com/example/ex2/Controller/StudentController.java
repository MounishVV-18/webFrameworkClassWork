package com.example.ex2.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex2.Model.Student;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController
{
    @GetMapping("/student")
    public Student getMethodName() 
    {
        return new Student("Mounish",111);
    }
}