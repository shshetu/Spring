package com.shetu;

import java.util.List;

import javax.activation.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
//fields
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSources(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate((javax.sql.DataSource) dataSource);
	}

	@Override
	public void create(String name, Integer age) {
		String sql = "insert into Student(name,age) values(?,?)";
		jdbcTemplateObject.update(sql, name, age);
		System.out.println("Created Record Name = " + name + " Age= " + age);
		return;
	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listStudents() {
		String sql = "select * from student";
		List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
		return students;
	}

}
