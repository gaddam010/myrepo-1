package com.cg;

import java.util.List;

import com.cg.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class TestQueryParameter {
		public static void main(String[] args)
		{
		
			   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "PERSISTENCE" );
			      EntityManager em = emfactory.createEntityManager();
			      
			      em.getTransaction().begin();

			      

	                Query q = em.createQuery("SELECT x FROM Student x where x.sid < :studentID and x.address.city = :studentCity");

	                q.setParameter("studentID", 5);

	                //Query q = em.createQuery("SELECT x FROM Student x where x.sid in :studentID and x.address.city = :studentCity");

	                //q.setParameter("studentID", Arrays.asList(1, 2));

	                q.setParameter("studentCity", "Bangalore");

	               

	                List<Student> results = (List<Student>) q.getResultList();

	               

	                for(Student s: results) {

	                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );

	                        System.out.println("Student name: " + s.getSname());

	                        System.out.println("Student ID: " + s.getSid());

	                        System.out.println("Student City: " + s.getAddress().getCity());

	                        System.out.println("Student Adress ID: " + s.getAddress().getAid());

	                        System.out.println("Student Zipcode: " + s.getAddress().getZipcode());

	                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );

	                }

	               

	                q = em.createQuery("SELECT x FROM Student x where x.sid < ?1 and x.address.city = ?2");

	                q.setParameter(1, 5);

	                q.setParameter(2, "Bangalore");

	               

	                results = (List<Student>) q.getResultList();

	               

	                for(Student s: results) {

	                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );

	                        System.out.println("Student name: " + s.getSname());

	                        System.out.println("Student ID: " + s.getSid());

	                        System.out.println("Student City: " + s.getAddress().getCity());

	                        System.out.println("Student Adress ID: " + s.getAddress().getAid());

	                        System.out.println("Student Zipcode: " + s.getAddress().getZipcode());

	                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" );

	                }

	               

	                em.getTransaction().commit();

	        }
		}


		/*
		 * 
		 * CREATE TABLE ADDRESS(

					AID INT(5) PRIMARY KEY AUTO_INCREMENT,
					
					CITY VARCHAR(30),
					
					ZIPCODE VARCHAR(30)
					
					);                
					
					 
					
					CREATE TABLE STUDENT(
					
					SID INT(5) PRIMARY KEY AUTO_INCREMENT,
					
					SNAME VARCHAR(30),
					
					AID INT(5),
					
					CONSTRAINT FOREIGN KEY (AID) REFERENCES ADDRESS (AID)
					
					);
					
					 
					
					INSERT  INTO ADDRESS(AID,CITY,ZIPCODE) VALUES (1,'Bangalore', '560010');
					
					 
					
					INSERT  INTO STUDENT(SID,SNAME,AID) VALUES (1,'Manu Manjunatha', 1);
					
					INSERT  INTO STUDENT(SID,SNAME,AID) VALUES (2,'Advith Tyagraj', 1);
					
					INSERT  INTO STUDENT(SID,SNAME,AID) VALUES (3,'Likitha', 1);
					
					INSERT  INTO STUDENT(SID,SNAME,AID) VALUES (4,'Tyagraj', 1);		
			 */
		 