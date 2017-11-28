package com.jrd.sms.dao;

import java.util.List;

import com.jrd.sms.entity.StudentDO;


public interface StudentDAO {
	
	public void createStudent(StudentDO studentDO);

	public List<StudentDO> getAllStudents();

}
