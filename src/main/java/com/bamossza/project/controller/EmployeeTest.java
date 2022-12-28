package com.bamossza.project.controller;

import com.bamossza.project.entities.onetoone.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name="EmpTest")
public class EmployeeTest {

    @Id
    @GeneratedValue(generator = "EMP_TEST_SEQ", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "EMP_TEST_SEQ", sequenceName = "EMP_TEST_SEQ", allocationSize=1)
    @Column(name="EMP_ID_TEST", unique=true, nullable=false, precision=10, scale=0)
    @Getter
    @Setter
    private int id;


    @Column(name="testEmailId")
    @Getter
    @Setter
    private String testEmailId;

    @Column(name="employeeId")
    @Getter
    @Setter
    private Long employeeId;

    @Column(name="firstname")
    @Getter
    @Setter
    private String firstname;

    @Column(name="lastname")
    @Getter
    @Setter
    private String lastname;

    @Column(name="cellphone")
    @Getter
    @Setter
    private String cellphone;


    public EmployeeTest() {}

    public EmployeeTest(String firstname, String lastname, String phone, String testEmailId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cellphone = phone;
        this.testEmailId = testEmailId;
    }



    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return "EmployeeTest{" +
                "employeeId=" + employeeId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", testEmailId'" + testEmailId + '\'' +
                '}';
    }

}