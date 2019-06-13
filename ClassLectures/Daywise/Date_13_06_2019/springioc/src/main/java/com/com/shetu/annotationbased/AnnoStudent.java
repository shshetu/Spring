package com.com.shetu.annotationbased;

public class AnnoStudent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnnoStudent{" +
                "name='" + name + '\'' +
                '}';
    }
    //Method

}
