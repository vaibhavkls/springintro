package com.sprinttest.pojo;

public class Address {
	
		private String houseNumber;
		private String street;
		private String city;
		private String state;
		private String country;
		private Long pinCode;
		
		public Address() {
			
		}
		
		public Address(String houseNumber, String street, String city, String state, String country, Long pinCode) {
			super();
			this.houseNumber = houseNumber;
			this.street = street;
			this.city = city;
			this.state = state;
			this.country = country;
			this.pinCode = pinCode;
		}
		public String getHouseNumber() {
			return houseNumber;
		}
		public void setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Long getPinCode() {
			return pinCode;
		}
		public void setPinCode(Long pinCode) {
			this.pinCode = pinCode;
		}

}
