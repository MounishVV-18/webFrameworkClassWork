package com.example.ex3.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class APIController {
    @GetMapping("/favcolor")
    public String getMethodName(@RequestParam String color) {
        return "My favorite color is : "+color;
    }
    
}
