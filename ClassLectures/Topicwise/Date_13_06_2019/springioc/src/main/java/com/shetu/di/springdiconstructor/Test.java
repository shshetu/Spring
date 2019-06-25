package com.shetu.di.springdiconstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

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
        Resource r = new ClassPathResource("diconstructorapplicationcontext.xml");
        BeanFactory factory = new XmlBeanFactory(r);
        Employee s = factory.getBean("r");
        s.show();
    }
}
