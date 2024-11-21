package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Address;
import com.tka.entity.Person;
import com.tka.entity.Voter_Id;

public class Dao {

	private SessionFactory factory;

	public Dao() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(Voter_Id.class);
		factory = cfg.buildSessionFactory();
	}

	// Save Method
	public void savePerson(Person person) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(person); 
		tx.commit();
		session.close();
	}


	// Get Method
	public Person getPerson(long getId) {
		Session session = factory.openSession();
		return session.get(Person.class, getId); 
	}


	// Update Method
	public void updatePerson(Person person) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(person); 
		tx.commit();
		session.close();
	}



	public void deletePerson(long deleteId) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Person person = session.get(Person.class, deleteId);
		if (person != null) {
			session.delete(person); 
			tx.commit();
			session.close();
		}
	}


	public void saveAddress(Address address) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(address);
		tx.commit();
		session.close();

	}


	public void saveVoterId(Voter_Id voterId) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(voterId); 
		tx.commit();
		session.close();
	}



	public void closeFactory() {
		if (factory != null) {
			factory.close();
		}
	}
}
