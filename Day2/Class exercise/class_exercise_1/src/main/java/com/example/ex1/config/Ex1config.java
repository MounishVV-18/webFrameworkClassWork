package com.example.ex1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Ex1config 
{
    @Value("Status")
    public String appname;
    
    @Value("1.2.1")
    public String Version;
}