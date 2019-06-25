package com.com.shetu.annotationbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    public AnnoStudent annoStudentBean() {
        return new AnnoStudent();
    }
}
