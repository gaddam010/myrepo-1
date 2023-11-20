package com.cg;

import java.io.IOException;
import java.util.Scanner;

import com.cg.entity.Employee;
import com.cg.util.CRUDOperations;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;

public class App {
 public static void main(String[] args) throws IOException {	
	/*
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
        Employee empObj = new Employee("Alex","Alex@gmail.com",50000d);
        entityManager.persist(empObj);
        entityManager.getTransaction().commit();
        entityManager.close();
        JPAUtil.shutdown();
        */
		CRUDOperations crudOperations = new CRUDOperations();
		String ans;
		Scanner sc;
		
do {		
	System.out.println(" Enter Choice");
	sc = new Scanner(System.in);
	int ch = sc.nextInt();
		switch (ch)
		{
		case 1:
			{ crudOperations.insertEntity();
	        break;
			}
		case 2:
			{crudOperations.findEntity();
	        break;
			}
		case 3:
			{crudOperations.updateEntity();
	        break;
			}
		case 4:
			{
	        crudOperations.removeEntity();
	        break;
			}
		}
		System.out.println(" Enter Answer(Yes/No ");
		Scanner sc1 = new Scanner(System.in);
		 ans = sc1.nextLine().trim();
} while (!"q".equals(ans));
}
}
