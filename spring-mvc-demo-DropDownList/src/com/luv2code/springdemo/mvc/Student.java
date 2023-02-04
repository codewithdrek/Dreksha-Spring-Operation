package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	
	//New Code
	private String country;
	
	//New County 
	private LinkedHashMap<String, String> countryOptions; 
	 
	
	public Student() {
		//populate Data
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DR", "Germany");
		countryOptions.put("IN", "India");
		
	}
	
	// New adding Country
	
	
	//Only Getter
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
