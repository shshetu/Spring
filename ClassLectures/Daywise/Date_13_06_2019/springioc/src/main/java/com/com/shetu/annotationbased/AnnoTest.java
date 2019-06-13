package com.com.shetu.annotationbased;

import com.example.springioc.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
        AnnoStudent std = ctx.getBean(AnnoStudent.class);
        std.setName("Shahariar shetu");
        System.out.println(std);
    }
}
