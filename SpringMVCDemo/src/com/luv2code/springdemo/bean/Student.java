package com.luv2code.springdemo.bean;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;

import com.sun.javafx.collections.MappingChange.Map;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;	//Commented for adding these details from props file
/*	@Value("#{countryOptions}")
	public Map <String,String> countryOptions;*/
	
	
	
	public Student(){
		
	/*	countryOptions = new LinkedHashMap<>();
		countryOptions.put("br", "brazil");
		countryOptions.put("in", "india");
		countryOptions.put("au", "Australia");
		countryOptions.put("fr", "France");*/
	}
	
	
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public LinkedHashMap <String, String> getCountryOptions() {
		return countryOptions;
	}


	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
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
	
	
	
	
	
}
