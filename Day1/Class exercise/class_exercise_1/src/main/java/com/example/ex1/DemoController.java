package com.example.ex1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DemoController
{@GetMapping("/abc")
public String getMethodName() {
    return "Welcome to Springboot";
}
}