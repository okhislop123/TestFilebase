package com.example.demofilebase;

public class Employee {
    private String name;
    private  String postion;

    public Employee() {}
    public Employee(String name, String postion) {
        this.name = name;
        this.postion = postion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }
}
