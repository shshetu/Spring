/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu.student;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Administrator
 */
@ManagedBean
public class Student {
    private String name;
    private String email;
    private String gender;
    private String[] courses;
    private String country;

    public Student() {
    }

    public Student(String name, String email, String gender, String[] courses, String country) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.courses = courses;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
