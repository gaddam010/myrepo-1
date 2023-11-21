package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employeedet")
public class EmployeeDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="age")
	private int age;

	public EmployeeDetail(int id,int age) {
		super();
		this.id = id;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setEmpId(int empId) {
		this.id = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeDetail [empId=" + id + ", age=" + age + "]";
	}
	public EmployeeDetail() {
		super();
	}
	

}
