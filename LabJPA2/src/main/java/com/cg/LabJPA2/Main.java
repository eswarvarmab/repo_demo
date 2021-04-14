package com.cg.LabJPA2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("LabJPA2");
		EntityManager em=factory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		List<Book> b=new ArrayList<Book>();
		b.add(new Book(101,"HarryPotter",1000));
		b.add(new Book(102,"JungleBook",800));
		b.add(new Book(103,"SwordGod",2000));
		Author a1=new Author(1,"Eswar");
		a1.setBooklist(b);
		et.begin();
		em.persist(a1);
//		et.commit();
//		em.close();
//		factory.close();
		Methods m=new Methods();
		List<Book> book1=m.getBooks();
		System.out.println(book1);
//		
		
		
	}
}
