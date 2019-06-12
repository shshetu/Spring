/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shetu;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Administrator
 */
@ManagedBean(name = "carService")
@ApplicationScoped
public class StudentService {

    private final static String[] ids;
    private final static String[] names;

    private final static String[] favouriteSubjects;

    static {
        ids = new String[5];
        ids[0] = "100";
        ids[1] = "101";
        ids[2] = "102";
        ids[3] = "103";
        ids[4] = "104";
        
        names = new String[5];
        names[0] = "Arif";
        names[1] = "Matin";
        names[2] = "Rahmat";
        names[3] = "Yasin";
        names[4] = "Tahmina";

        favouriteSubjects = new String[5];
        favouriteSubjects[0] = "Java";
        favouriteSubjects[1] = "Swing";
        favouriteSubjects[2] = "HTML";
        favouriteSubjects[3] = "Spring";
        favouriteSubjects[4] = "Servlet";

    }

    public List<Student> createStudents(int size) {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Student(ids, names, favouriteSubjects));
        }
    }

}
