package com.cg.LabJPA2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "book")
public class Book {
	@Id
	private int ISBN;
	private String title;
	private int price;
	
	
	public Book(int iSBN, String title, int price) {
		ISBN = iSBN;
		this.title = title;
		this.price = price;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
