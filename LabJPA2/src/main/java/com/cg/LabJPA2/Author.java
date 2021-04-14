package com.cg.LabJPA2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author{
	
	@Id
	private int id;
	@Column(name = "AuthorName")
	private String name;
	
	
	
	public Author() {
		
	}
	public Author(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@OneToMany(cascade = CascadeType.ALL)
	List<Book> booklist=new ArrayList<Book>();
	
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
	public List<Book> getBooklist() {
		return booklist;
	}
	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}
	
	
}
