package com.cg;

import java.util.List;

import com.cg.entity.Employee;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class TestJPQLNamedQuery {
	public static void main(String[] args)
	{
	
		   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "PERSISTENCE" );
		      EntityManager entitymanager = emfactory.createEntityManager();

		      Query query = entitymanager.createNamedQuery("find employee by id");
		      
		      query.setParameter("id", 1);
		      List<Employee> list = query.getResultList( );
		      
		      for( Employee e:list ){
		         System.out.print("Employee ID :" + e.getEmployeeId( ));
		         System.out.println("\t Employee Name :" + e.getEmployeeName( ));
		         System.out.println("\t Employee Name :" + e.getSalary( ));
		      }  
		      }}

