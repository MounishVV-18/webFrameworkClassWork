package com.example.ex1.Controller;


import org.springframework.web.bind.annotation.RestController;

import com.example.ex1.config.Ex1config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Ex1Controller 
{
    
    @Autowired
    public Ex1config ex1config;
    
    @GetMapping("/info")
    public String getMethodName() 
    {
        return "AppName is : "+ex1config.appname+" Version is :"+ex1config.Version;
    }
}