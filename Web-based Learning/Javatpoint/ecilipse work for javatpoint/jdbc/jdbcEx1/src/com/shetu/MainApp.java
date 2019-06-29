package com.shetu;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shetu/Beans.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

		System.out.println("=========Records Creation=========");
		studentJDBCTemplate.create("Shetu", 11);
		studentJDBCTemplate.create("Shanto", 12);
		studentJDBCTemplate.create("Nodi", 13);
		System.out.println("--------------------Listing Multiple Records--------");
		List<Student> students = studentJDBCTemplate.listStudents();

		for (Student record : students) {
			System.out.println("ID: " + record.getId());
			System.out.println(", Name: " + record.getName());
			System.out.println(", Age: " + record.getAge());
		}
	}
}
