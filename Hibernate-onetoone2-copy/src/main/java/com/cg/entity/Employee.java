package com.cg.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_one")

public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;
	
	
	@OneToOne(cascade = CascadeType.ALL )
    @JoinColumn(name = "id")

    private EmployeeDetail employeedetails;
	
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, EmployeeDetail employeedetails) {
		super();
		this.id = id;
		this.name = name;
		this.employeedetails = employeedetails;
	}
	
	
	
	public EmployeeDetail getEmployeedetails() {
		return employeedetails;
	}

	public void setEmployeedetails(EmployeeDetail employeedetails) {
		this.employeedetails = employeedetails;
	}

	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", employeedetails=" + employeedetails + "]";
	}
	
	
	
	
}
