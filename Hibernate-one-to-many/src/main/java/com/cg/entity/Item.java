package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="item2")
public class Item {
	
	public Item() {
		super();
	}
	public Item(String itemName, int quantity) {
		super();
		
		this.itemName = itemName;
		this.quantity = quantity;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String itemName;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", quantity=" + quantity + "]";
	}
	
	
	
	

}
