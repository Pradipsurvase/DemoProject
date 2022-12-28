package com.bamossza.project.dao;

import java.util.List;
import java.util.Map;

import com.bamossza.project.controller.EmployeeTest;
import com.bamossza.project.entities.Car;
import com.bamossza.project.repository.EmployeeTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface CarDao {

    public Car findById(int id);

    public void remove(int id);

    public void add(Car car);

    public void update(int id, Car car);

    public List<Map<String, Object>> findAll();

   // public EmployeeTest findByTestEmailId(String emailId);
}
