package com.example.ex4.model;

public class Address 
{
    private String country;
    private String state;
    private String streetname;
    private String name;
    private String district;
    private String area;
    private int pincode;
    private int doorno;
    public Address(String a,String b,String c,String d,String e,String f,int g,int h)
    {
        this.country=a;
        this.state=b;
        this.streetname=c;
        this.name=d;
        this.district=e;
        this.area=f;
        this.pincode=g;
        this.doorno=h;
    }
    public String getCountry() {
        return country;
    }
    public String getState() {
        return state;
    }
    public String getStreetname() {
        return streetname;
    }
    public String getName() {
        return name;
    }
    public String getDistrict() {
        return district;
    }
    public String getArea() {
        return area;
    }
    public int getPincode() {
        return pincode;
    }
    public int getDoorno() {
        return doorno;
    }
}