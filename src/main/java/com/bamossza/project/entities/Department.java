package com.bamossza.project.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

    private long id;
    private String departmentName;

    @Getter
    @Setter
    private String departmentDescriptiom;

    public Department() {

    }

    public Department(String firstName, String lastName) {
        this.departmentName = firstName;
        this.departmentDescriptiom = lastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "departmentName", nullable = false)
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String firstName) {
        this.departmentName = firstName;
    }

    @Column(name = "departmentDescriptiom", nullable = false)
    public String getDepartmentDescriptiom() {
        return departmentDescriptiom;
    }
    public void setLastName(String departmentDescriptiom) {
        this.departmentDescriptiom = departmentDescriptiom;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + departmentName + ", lastName=" + departmentDescriptiom + "]";
    }

}
