package com.example.ex3.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student 
{
    private String name;
    private int roll;

    @JsonIgnore
    private String desc;   
    
    public Student(String a,int b,String c)
    {
        this.name=a;
        this.roll=b;
        this.desc=c;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getDesc() {
        return desc;
    }
}