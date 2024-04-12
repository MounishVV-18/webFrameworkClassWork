package com.example.ex2.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student 
{
    @JsonProperty("Student Name")
    private String name;

    @JsonProperty("Roll NO")
    private int roll;

    public Student(String a,int b)
    {
        this.name=a;
        this.roll=b;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }
}