/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author aryan
 */

@Entity
public class Person {
    
    @Id
    @Column(name = "PERSON_ID")
    int id;
    @Column(name = "NAME")
    String name; 
    @Column(name = "LOCATION_ID")
    Integer address; 
    @Column(name = "EMAIL")
    String email; 
    @Column(name = "PHONE_NO")
    Long phoneNo; 
    @Column(name = "DATE_OF_BIRTH")
    Date dateOfBirth; 
    @Column(name = "BLOOD_GROUP")
    String bloodGroup; 
    @Column(name = "ROLE")
    String role; 
    @Column(name = "GENDER")
    String gender; 
//    @Column(name = "C")
//    String communityName;
    

    public Person(String name, int address, String email, long phoneNo, Date dateOfBirth, int id, String bloodGroup, String role, String gender) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.bloodGroup = bloodGroup;
        this.role = role;
        this.gender = gender;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public Integer getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getRole() {
        return role;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   
}
