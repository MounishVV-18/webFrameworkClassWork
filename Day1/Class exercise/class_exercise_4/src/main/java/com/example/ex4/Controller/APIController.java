package com.example.ex4.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex4.model.Address;


@RestController
public class APIController {
    @GetMapping("/path")
    public Address getMethodName() {
        return new Address("India","tamil nadu","fr","Main","CBE","rn",123456,123);
    }
    
}
