package com.simplilearn.fsd.serialization;

public class User {

	String nationality;
	String country = "India";
	
	User(){
		System.out.println("Default constructor");
	}

	public User(String nationality, String country) {
		super();
		this.nationality = nationality;
		this.country = country;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
