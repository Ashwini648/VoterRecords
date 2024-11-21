package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Voter_Id {

	@Id
	private String voterId; 
	private String constituency;

	@OneToOne(mappedBy = "voter") 
	private Person person;


	public Voter_Id() {
		super();
	}


	public Voter_Id(String voterId, String constituency) {
		super();
		this.voterId = voterId;
		this.constituency = constituency;
	}


	public Voter_Id(String voterId, String constituency, Person person) {
		super();
		this.voterId = voterId;
		this.constituency = constituency;
		this.person = person;
	}


	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


	@Override
	public String toString() {
		return "VoterId [voterId=" + voterId + ", constituency=" + constituency + "]";
	}
}
