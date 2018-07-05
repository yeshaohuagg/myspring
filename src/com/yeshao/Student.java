package com.yeshao;

public class Student {
    private String name;
    private Integer age;
    private Integer id;

    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
