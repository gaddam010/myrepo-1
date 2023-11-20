package com.cg.util;

import com.cg.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CRUDOperations {public void insertEntity() {
    EntityManager  entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();
    Employee empObj = new Employee("Alex","Alex@gmail.com",50000d);
    entityManager.persist(empObj);
    entityManager.getTransaction().commit();
    entityManager.close();
}

public void findEntity() {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();
    
    Employee empObj = entityManager.find(Employee.class, 1);
    System.out.println(empObj);
    entityManager.getTransaction().commit();
    entityManager.close();
}

public void updateEntity() {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();

    Employee empObj = entityManager.find(Employee.class, 1);
    System.out.println(empObj);
    // The entity object is physically updated in the database when the transaction
    // is committed
    empObj.setEmployeeName("John");
    empObj.setEmail("john@gmail.com");
    entityManager.getTransaction().commit();
    entityManager.close();
}

public void removeEntity() {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();
    Employee empObj = entityManager.find(Employee.class, 1);
    System.out.println(empObj);
    entityManager.remove(empObj);
    entityManager.getTransaction().commit();
    entityManager.close();
}
}