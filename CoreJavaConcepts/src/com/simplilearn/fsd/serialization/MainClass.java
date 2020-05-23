package com.simplilearn.fsd.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Customer cust = new Customer(101, "Sahana", "US", "Indian"); 
		System.out.println(cust);
		
/*		Address address = new Address("Kodialbail", "Mangalore");
		cust.setCustId(1);
		cust.setCustName("sahana");
		cust.setAddress(address);*/
		
		FileOutputStream fileOutputStream = new FileOutputStream("cus.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(cust);
		objectOutputStream.close();
		fileOutputStream.close();
		System.out.println("Serialization complete");
		
		Customer cus = null;
		FileInputStream fis = new FileInputStream("cus.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		cus = (Customer) ois.readObject();
		ois.close();
		fis.close();

		System.out.println(cust);
		System.out.println("Deserialization complete");
	}

}
