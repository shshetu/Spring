package com.shetu.di.springdiAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * Whenever we are on the main method, we have to bear my mind:
 * 1. Make ApplicationContext object like this:
 * ApplicationContext context = new AnnotationConfigApplicationContext("cofig class Name.class");
 * since it is Annotation based
 *
 * 2. From the ApplicationContext object we take getBean(Class name.class) method
 * */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee e = context.getBean(Employee.class);
        e.show();
    }
}
