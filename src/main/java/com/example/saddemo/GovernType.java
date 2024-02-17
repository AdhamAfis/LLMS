package com.example.saddemo;

public class GovernType {
    private String name;
    private AGovern govern;

    public GovernType() {
    }

    public GovernType(String name, AGovern govern) {
        this.name = name;
        this.govern = govern;
    }

    public String getName() {
        return name;
    }
}
