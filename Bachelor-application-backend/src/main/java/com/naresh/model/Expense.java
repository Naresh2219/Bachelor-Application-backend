package com.naresh.model;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Expenses")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String itemName;
	private String itemQuantity;
	private String itemPrice;
	private LocalDateTime createdAt;
	public Expense(String id, String itemName, String itemQuantity, String itemPrice, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.createdAt = createdAt;
	}
	public Expense() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Expense [id=" + id + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity + ", itemPrice="
				+ itemPrice + ", createdAt=" + createdAt + "]";
	}
	
}
