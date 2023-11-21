package com.cg;

import java.util.HashSet;
import java.util.Set;

import com.cg.entity.Cart;

import com.cg.entity.Item;
import com.cg.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Test {

	public static void main(String[] args) {
		
		EntityManager entitymanager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		entitytransaction.begin();
		
		/*Item item1=new Item("croptop",5);
		Item item2=new Item("skirt",6);
		
		Set<Item> itemSet=new HashSet<Item>();
		itemSet.add(item1);
		itemSet.add(item2);*/

		
		Item items1=new Item("croptop",5);
		Item items2=new Item("skirt",6);
		
		Set<Item> items=new HashSet<Item>();
		items.add(items1);
		items.add(items2);

		
		//entitymanager.persist(items1);
		//entitymanager.persist(items2);
		Cart cart=new Cart();
		cart.setName("My_cart");
		cart.setItems(items);
		
		
		entitymanager.persist(cart);
		entitytransaction.commit();
		entitymanager.close();
	
		
		
		
		
		
		
	}

}
