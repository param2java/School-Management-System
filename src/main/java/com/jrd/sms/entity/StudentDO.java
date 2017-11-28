package com.jrd.sms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class StudentDO implements Serializable {

	private static final long serialVersionUID = -1057657891960940892L;

	@Id
	@Column(name = "ROLL_NO")
	private Long rollNo;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private Integer age;

	@Column(name = "CLASS")
	private String studentClass;

	@Column(name = "ADDRESS")
	private String address;

	public StudentDO() {

	}

	public StudentDO(Long rollNo, String name, Integer age,
			String studentClass, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.studentClass = studentClass;
		this.address = address;
	}

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
