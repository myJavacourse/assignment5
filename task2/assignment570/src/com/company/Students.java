package com.company;

public class Students {

    private String name;
    private  int age;


    Students (String name, int age){}


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
