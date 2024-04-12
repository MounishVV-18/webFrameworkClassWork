package com.example.ex2.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class APIController {
    @GetMapping("/student/{name}")
    public String getMethodName(@PathVariable("name") String name) {
        return "Welcome " + name + "!";
    }    
}
