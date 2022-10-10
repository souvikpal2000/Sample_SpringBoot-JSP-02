package com.example.wiprojsp02.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bids {
	@Id
	private String itemId;
	private String itemName;
	private String name;
	private String email;
	private String bidAmount;
	private String autoIncrement;
	
	Bids(){}

	public Bids(String itemId, String itemName, String name, String email, String bidAmount, String autoIncrement) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.name = name;
		this.email = email;
		this.bidAmount = bidAmount;
		this.autoIncrement = autoIncrement;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(String bidAmount) {
		this.bidAmount = bidAmount;
	}

	public String isAutoIncrement() {
		return autoIncrement;
	}

	public void setAutoIncrement(String autoIncrement) {
		this.autoIncrement = autoIncrement;
	}

	@Override
	public String toString() {
		return "Bids [itemId=" + itemId + ", itemName=" + itemName + ", name=" + name + ", email=" + email
				+ ", bidAmount=" + bidAmount + ", autoIncrement=" + autoIncrement + "]";
	}
	
	
}
