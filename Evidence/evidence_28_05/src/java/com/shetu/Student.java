/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Student implements Serializable{
    private String id;
    private String name;
    private String favouriteSubject;

    public Student() {
    }

    public Student(String id, String name, String favouriteSubject) {
        this.id = id;
        this.name = name;
        this.favouriteSubject = favouriteSubject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteSubject() {
        return favouriteSubject;
    }

    public void setFavouriteSubject(String favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }
   
}
