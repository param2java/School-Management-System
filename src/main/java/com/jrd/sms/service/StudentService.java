package com.jrd.sms.service;

import java.util.List;

import com.jrd.sms.model.Student;


public interface StudentService {
	
	public Student createStudent(Student student);

	public List<Student> getAllStudents();

}
