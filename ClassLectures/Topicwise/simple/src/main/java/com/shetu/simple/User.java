package com.shetu.simple;

public class User {
    private Long id;
    private String name;
    private String userName;
    private String password;
    private String gender;
    private String country;

    //default constructor
    public User() {
    }

    //Parameterized constructor
    public User(Long id, String name, String userName, String password, String gender, String country) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.gender = gender;
        this.country = country;
    }

    //Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }
}
