package com.shetu;

import java.util.List;

import javax.activation.DataSource;

public interface StudentDAO {
//method:initialize database resources ie: connection
	public void setDataSources(DataSource dataSource);
	
	//method: to be used to create a record in the student table
	public void create(String name, Integer age);
	
	//method: get Student data by id
	public Student getStudent(Integer id);
	
	//method:get student list
	public List<Student> listStudents();
}
