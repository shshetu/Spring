package com.shetu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @GetMapping(name = "/save")

    public void saveStudent() {
        Student student = new Student(UUID.randomUUID().toString());
        this.repository.save(student);
        System.out.println("Save successfully!");
    }

    @GetMapping(name = "/students")
    public List<Student> getStudentList() {
        List<Student> list = new ArrayList<>();
        list = this.repository.findAll();
        return list;
    }
}
