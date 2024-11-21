package com.tka.service;

import com.tka.dao.Dao;
import com.tka.entity.Address;
import com.tka.entity.Person;
import com.tka.entity.Voter_Id;

public class Service {

	private Dao dao = new Dao();
	public void savePerson(Person person, Voter_Id voterId, Address address) {
		person.setVoter(voterId);
		person.getAddresses().add(address);
		dao.savePerson(person); 
	}

	public Person getPersonById(long getId) {
		return dao.getPerson(getId);
	}


	public void updatePerson(Person person) {
		dao.updatePerson(person);
	}

	public void deletePerson(long deleteId) {
		dao.deletePerson(deleteId);
	}

	public void saveAddress(Address address) {
		dao.saveAddress(address);
	}

	public void saveVoterId(Voter_Id voterId) {
		dao.saveVoterId(voterId);
	}

	public void closeService() {
		dao.closeFactory();
	}
}
