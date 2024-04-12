package com.example.ex4.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex4.Model.Books;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class APIController 
{
    Date d = new Date();
    @GetMapping("/path")
    public Books func()
    {
        return new Books("Success","Roi",d);
    }
}