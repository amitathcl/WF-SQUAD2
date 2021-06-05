package com.example.demo.model;

public class Car implements CarService {

	String Make;
	String Model;
	String Zipcode;
	@Override
	public String getMake() {
		return Make;
	}
	@Override
	public void setMake(String make) {
		Make = make;
	}
	@Override
	public String getModel() {
		return Model;
	}
	@Override
	public void setModel(String model) {
		Model = model;
	}
	@Override
	public String getZipcode() {
		return Zipcode;
	}
	@Override
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	
	
	
}
