package com.jrd.sms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrd.sms.dao.StudentDAO;
import com.jrd.sms.entity.StudentDO;
import com.jrd.sms.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	@Transactional
	public Student createStudent(Student student) {
		
		StudentDO studentDO = new StudentDO();
		studentDO.setRollNo(studentDO.getRollNo());
		studentDO.setName(studentDO.getName());
		studentDO.setAge(studentDO.getAge());
		studentDO.setStudentClass(studentDO.getStudentClass());
		studentDO.setAddress(studentDO.getAddress());
		studentDAO.createStudent(studentDO);
		return student;
		}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		List<Student> studentsList = new ArrayList<Student>();
		List<StudentDO> students= studentDAO.getAllStudents();
		
		for(StudentDO student:students){
			studentsList.add(covertStudentToStudentDTO(student));
		}
		
		return studentsList;
	}

	private Student covertStudentToStudentDTO(StudentDO studentDO) {
	
		Student student = new Student();
		student.setRollNo(student.getRollNo());
		student.setName(student.getName());
		student.setAge(student.getAge());
		student.setStudentClass(student.getStudentClass());
		student.setAddress(student.getAddress());
		return student;
	}

}
