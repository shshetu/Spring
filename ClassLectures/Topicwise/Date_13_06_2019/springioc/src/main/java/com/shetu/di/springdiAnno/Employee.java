package com.shetu.di.springdiAnno;

public class Employee {
    private int id;
    private String name;
    //Declaring Address class
    private Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void show() {
        //here we are printing 2 things of the given class
        //here we are calling the toString() method from the Address class
        System.out.println(id + " " + name);
        System.out.println(address.toString());
    }
}
