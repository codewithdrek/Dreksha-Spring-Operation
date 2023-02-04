package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOption; 
	//checkbox Step 2
	private String[] operatingSystem;
	
	public Student() {
		//populate Data
		countryOption = new LinkedHashMap<>();
		countryOption.put("BR", "Brazil");
		countryOption.put("FR", "France");
		countryOption.put("DR", "Germany");
		countryOption.put("IN", "India");
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	//getter setter
	public String[] getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	
}
