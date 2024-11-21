package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int srno; 

	private int pincode;
	private String cityName; 


	public Address() {
		super();
	}


	public Address(int srno, int pincode, String cityName) {
		super();
		this.srno = srno;
		this.pincode = pincode;
		this.cityName = cityName;
	}


	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [srno=" + srno + ", pincode=" + pincode + ", cityName=" + cityName + "]";
	}
}
