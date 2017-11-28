package com.jrd.sms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jrd.sms.entity.StudentDO;

@Repository
public class StudentDAOImpl extends GenericDAO implements StudentDAO {

	@Override
	public void createStudent(StudentDO studentDO) {
		
         getEntityManager().persist(studentDO);
	}

	@Override
	public List<StudentDO> getAllStudents() {
		return (List<StudentDO>)getEntityManager().createQuery(" from Student").getResultList();
	}

}
