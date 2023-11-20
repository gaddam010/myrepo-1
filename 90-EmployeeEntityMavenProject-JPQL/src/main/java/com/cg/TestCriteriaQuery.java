package com.cg;

import java.util.List;

import com.cg.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;


public class TestCriteriaQuery {

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "PERSISTENCE" );  
         EntityManager em = emf.createEntityManager();  
         em.getTransaction().begin( );  
         
         
         //Create CriteriaBuilder object by invoking getCriteriaBuilder() method of EntityManager.
         CriteriaBuilder cb = em.getCriteriaBuilder();


         //Create an instance of CriteriaQuery interface to create a query object.
         CriteriaQuery<Student> criteriaQuery = cb.createQuery(Student.class);

     
         //Specify query roots by invoking from() method of CriteriaQuery
         //query roots specify the domain objects on which the query is evaluated.
         Root<Student> from = criteriaQuery.from(Student.class);

      
         //Call the select method of CriteriaQuery Object to specify type of query result.
         criteriaQuery.select(from);

        
         //Create the Predicate by calling the restriction methods of CriteriaBuilder.
         //Here we are putting a restriction to select sname which is equal to Manu Manjunatha
         Predicate predicate = cb.equal(from.get("sname"), "Alex Martin");

        

         //Apply the Predicate by invoking where method of CriteriaQuery
         criteriaQuery.where(predicate);

         List<Student> results = em.createQuery(criteriaQuery).getResultList();

         for(Student s: results) {
                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );
                 if (s.getSname() != null) {
                         System.out.println("Student name: " + s.getSname());
                 }

                 if (s.getSid() != 0) {
                         System.out.println("Student ID: " + s.getSid());
                 }

                 if (s.getAddress().getCity() != null) {
                         System.out.println("Student City: " + s.getAddress().getCity());
                 }

                 if (s.getAddress().getCity() != null) {
                         System.out.println("Student City: " + s.getAddress().getCity());
                 }

                 if (s.getAddress().getZipcode() != null) {
                         System.out.println("Student Zipcode: " + s.getAddress().getZipcode());
                 }

                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );

         }
         
         
         
         
         
         
         
         
         
         
         /*---
         CriteriaBuilder cb=em.getCriteriaBuilder();  
         CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
           
        Root<Student> stud=cq.from(Student.class);  
        cq.select(stud); 
     
        //-------_Select----------
         CriteriaQuery<Student> select = cq.select(stud);  
         TypedQuery<Student> q = em.createQuery(select);  
         List<Student> list = q.getResultList();  
 
         System.out.println("s_id");  
              
           
         for(Student s:list)  
         {  
         System.out.println(s.getSid()+ "  "+s.getSname());  
     
       }  
       
       
       
       */
           
em.getTransaction().commit();  
         em.close();  
         emf.close();    
    

	}

}
