package com.cg.LabJPA2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Methods{

		public List<Book> getBooks(){
			EntityManagerFactory factory =Persistence.createEntityManagerFactory("LabJPA2");
			EntityManager em=factory.createEntityManager();
			List<Book> book=em.createQuery("From book").getResultList();
			return book;
			
		}
}
