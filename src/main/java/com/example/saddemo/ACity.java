package com.example.saddemo;

public class ACity {
    private String name;
    private GovernType govern;
    public ACity(String name, GovernType Govern) {
        this.govern = Govern;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public GovernType getGovern() {
        return govern;
    }

}
