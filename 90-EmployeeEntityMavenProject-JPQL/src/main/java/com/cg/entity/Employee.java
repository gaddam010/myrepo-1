package com.cg.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
@Entity
@Table(name="employee_table")
@NamedQuery(query = "Select e from Employee e where e.employeeId= :id", name = "find employee by id")
//@NamedQuery(name = "namequery", query = "SELECT x FROM Employee x where x.employeeId < :employeeId and x.address.city = :studentCity"),


public class Employee {
	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer employeeId;
	
	@Column(name="employee_name",length=100,nullable=false)
	private String employeeName;
	
	@Column(name="email",unique=true)
	private String email;

	@Column(name="salary")
	private Double salary;
	public Employee( ) {}
	
	public Employee( String employeeName, String email,  Double salary) {
		super();
		this.employeeName = employeeName;
		this.email = email;
		
		this.salary = salary;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
}