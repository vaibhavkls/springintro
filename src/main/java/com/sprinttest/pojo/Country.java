package com.sprinttest.pojo;

import java.util.Map;
import java.util.Set;

public class Country {
	
	private Set<String> listOfCountries;
	private Map<String, String> mapOfCountries;

	public Set<String> getListOfCountries() {
		return listOfCountries;
	}

	public void setListOfCountries(Set<String> listOfCountries) {
		this.listOfCountries = listOfCountries;
	}

	public Map<String, String> getMapOfCountries() {
		return mapOfCountries;
	}

	public void setMapOfCountries(Map<String, String> mapOfCountries) {
		this.mapOfCountries = mapOfCountries;
	}
	
	

}
