package com.shetu.studentAddress;

import com.example.springioc.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myStudentTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myApplicationContext.xml");
        Student student = (Student) context.getBean("mystudentbean");
        student.displayInfo();
    }

}
