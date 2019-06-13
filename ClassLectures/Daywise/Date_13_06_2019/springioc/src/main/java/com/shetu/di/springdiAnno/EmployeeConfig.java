package com.shetu.di.springdiAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//processes to calculate:
//1. add 2 annotations : @Configuration , @Bean
//2. We create a method of Employee Class type, and Address Class type
@Configuration
public class EmployeeConfig {
 @Bean
//we are gonna make 2 ClassNameBean() methods  where these methods are those class type
 public Employee employeeBean(){
     Employee employee = new Employee(1000,"Shahariar Shetu",new Address("Mirpur","Dhaka","Bangladesh"));
 return  employee;
 }

 @Bean
    public  Address addressBean(){
     Address address = new Address("Mirpur","Dhaka","Bangladesh");
 return  address;
 }
}
