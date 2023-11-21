package com.cg.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cart2")
public class Cart {

	public Cart() {
		super();
	}

	public Cart(String name, Set<Item> items) {
		super();
		
		this.name = name;
		this.items = items;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="items_id")
	private Set<Item> items;

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

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", items=" + items + "]";
	}

	
}
