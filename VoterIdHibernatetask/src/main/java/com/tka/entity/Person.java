package com.tka.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private long aadharId; 
	private String name;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "voter_id", referencedColumnName = "voterId") 
	private Voter_Id voter;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "person_id") 
	private List<Address> addresses = new ArrayList<>();


	public Person() {
		super();
	}


	public Person(long aadharId, String name) {
		super();
		this.aadharId = aadharId;
		this.name = name;
	}


	public Person(int aadharId, String name, Voter_Id voter, List<Address> addresses) {
		super();
		this.aadharId = aadharId;
		this.name = name;
		this.voter = voter;
		this.addresses = addresses;
	}


	public long getAadharId() {
		return aadharId;
	}

	public void setAadharId(long aadharId) {
		this.aadharId = aadharId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Voter_Id getVoter() {
		return voter;
	}

	public void setVoter(Voter_Id voter) {
		this.voter = voter;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


	@Override
	public String toString() {
		return "Person [aadharId=" + aadharId + ", name=" + name + ", voter=" + voter + ", addresses=" + addresses + "]";
	}
}
