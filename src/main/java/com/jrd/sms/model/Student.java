package com.jrd.sms.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private Long rollNo;

	private String name;

	private Integer age;

	private String studentClass;

	private String address;

	public Student() {

	}

	public Student(Long rollNo, String name, Integer age,
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
