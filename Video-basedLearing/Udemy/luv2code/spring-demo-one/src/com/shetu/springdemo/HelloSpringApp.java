package com.shetu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
public static void main(String[] args) {
	//load the spring configuration file
	//or step-2 create the spring container
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//retrieve bean from the spring container
	Coach theCoach = context.getBean("myCoach",Coach.class);
	
	//call methods on the bean
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());
	///close the context
	context.close();
}
}