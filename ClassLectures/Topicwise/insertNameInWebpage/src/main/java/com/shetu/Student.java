package com.shetu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Student {
    @Entity
    @Table(name="stu")

    public class Student{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        public Student(){}

        public Student(String name){
            this.name = name;
        }

        public Long getId(){
            return id;
        }
    }
}
