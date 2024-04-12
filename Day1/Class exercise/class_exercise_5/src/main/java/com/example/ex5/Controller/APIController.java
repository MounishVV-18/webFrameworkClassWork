package com.example.ex5.Controller;


import org.springframework.web.bind.annotation.RestController;

import com.example.ex5.Model.Students;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class APIController 
{
    @GetMapping("/allstudents")
    public ArrayList<Students> getMethodName() 
    {
        ArrayList<Students> ll = new ArrayList<Students>();

        Students s1 = new Students("Mounish",111);
        Students s2 = new Students("Nitin", 123);

        ll.add(s1);
        ll.add(s2);

        return ll;
    }
}