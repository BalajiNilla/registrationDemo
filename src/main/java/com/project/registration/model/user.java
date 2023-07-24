package com.project.registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data

@Entity
@Table(name = "UsersTable")
public class user 
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String firstname;
    private String lastname;
    private String dob;
    private Long phone;
    private String email;
    private String address;
    public user() {};
    public user(String firstname, String lastname, String dob, Long phone, String email, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
	public void setId(int id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    @Override
    public String toString() {
        return "user [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob + ", phone="
                + phone + ", email=" + email + ", address=" + address + "]";
    }

    
    
}
