package com.example.saddemo;

public class AGovern {
    private String name;
    private ACountry country;
    public AGovern(String name, ACountry country) {
        this.country=country;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ACountry getCountry() {
        return country;
    }
    public void setCountry(ACountry country) {
        this.country = country;
    }
}
