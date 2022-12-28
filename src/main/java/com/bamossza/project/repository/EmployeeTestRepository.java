package com.bamossza.project.repository;

import com.bamossza.project.controller.EmployeeTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTestRepository extends JpaRepository<EmployeeTest, Integer> {

    EmployeeTest findByTestEmailId(String emailId);
}
