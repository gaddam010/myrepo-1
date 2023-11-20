package com.cg;

import java.util.List;

import com.cg.entity.Employee;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class TestJPQLSelect {
	public static void main(String[] args)
	{
	
		   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "PERSISTENCE" );
		      EntityManager entitymanager = emfactory.createEntityManager();

		      //Display the employee in upper case
		      Query query = entitymanager.createQuery("Select UPPER(e.employeeName) from Employee e");
		      List<String> list = query.getResultList();

		      for(String e:list) {
		         System.out.println("Employee NAME :"+e);
		      }
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      //Aggregate function- Display the maximum salary of Employee
		      Query query1 = entitymanager.createQuery("Select MAX(e.salary) from Employee e");
		      Double result = (Double) query1.getSingleResult();
		      System.out.println("Max Employee Salary :" + result);
		      
		      
		      
		      
		      
		    
		      
		      
		      
		      // Display the  salary between 1000-2000
		      
		      System.out.println(" Salary between 1000 and 2000 ");
		      Query query4 = entitymanager.createQuery( "Select e " + "from Employee e " + "where e.salary " + "Between 1000 and 2000" );

		      List<Employee> list4 = (List<Employee>)query4.getResultList( );

		      for( Employee e:list4 ) {
		         System.out.print("Employee ID :" + e.getEmployeeId( ));
		         System.out.println("\t Employee Name :" + e.getEmployeeName( ));
		         System.out.println("\t Employee Name :" + e.getSalary( ));
		      }
		      
		      //Order by
		    System.out.println(" Order by name ");
		      Query query3 = entitymanager.createQuery( "Select e " + "from Employee e " + "ORDER BY e.employeeName ASC" );

		      List<Employee> list3 = (List<Employee>)query3.getResultList( );

		      for( Employee e:list3 ) {
		         System.out.print("Employee ID :" + e.getEmployeeId( ));
		         System.out.println("\t Employee Name :" + e.getEmployeeName( ));
		         System.out.println("\t Employee Name :" + e.getSalary( ));
		      }
		  
		      }}

