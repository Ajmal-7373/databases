package com.examplae.demo.CarRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplae.demo.CarModel.CarModel;

public interface CarRepository extends JpaRepository<CarModel, Integer> {

}
