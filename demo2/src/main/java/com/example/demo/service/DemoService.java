package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.DemoRepositoryInterface;

@Service
public class DemoService {
	
	@Autowired
	DemoRepositoryInterface demoRepositoryInterface;
	
	public List<Car> findAll(String Model , String Make, String ZipCode)
	{
		List<Car> allCars = new ArrayList<>();
		
		return allCars;
	}
	



}
