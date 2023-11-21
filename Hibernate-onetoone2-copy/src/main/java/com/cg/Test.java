package com.cg;

import com.cg.entity.Employee;
import com.cg.util.CRUDOperations;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Test {

	public static void main(String[] args) {
		
		CRUDOperations c=new CRUDOperations();
		c.insertEntity();
		c.findEntity();
		c.updateEntity();
		c.removeEntity();
		

	}

}
