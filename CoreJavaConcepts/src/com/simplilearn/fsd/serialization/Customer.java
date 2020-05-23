package com.simplilearn.fsd.serialization;

import java.io.Serializable;

public class Customer extends User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	int custId;
	String custName;
	
	
	public Customer(int custId, String custName, String country, String nationality) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.country = country;
		this.nationality = nationality;
		
		System.out.println("Customized customer constructor");
	}
	/*Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ",country=" + country+",nationality="+nationality+"]" ;
	
	}
	
}
