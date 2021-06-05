package com.example.demo.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;

@Repository
public interface DemoRepositoryInterface extends CrudRepository<Car,Long> {

	
}
