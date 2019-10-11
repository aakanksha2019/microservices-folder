package com.cts.user.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String password;
	private String role;
	private String firstname;
	private String lastname;
	private boolean active = true;
	private int experience;
	private boolean confirmedSignUp;
	private String regCode;
	private Long phone;
	private boolean resetPassword;
	private Date resetPasswordDate;
	private String linkedInUrl;
	public User(Long id, String email, String password, String role, String firstname, String lastname, boolean active,
			int experience, boolean confirmedSignUp, String regCode, Long phone, boolean resetPassword,
			Date resetPasswordDate, String linkedInUrl) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
		this.firstname = firstname;
		this.lastname = lastname;
		this.active = active;
		this.experience = experience;
		this.confirmedSignUp = confirmedSignUp;
		this.regCode = regCode;
		this.phone = phone;
		this.resetPassword = resetPassword;
		this.resetPasswordDate = resetPasswordDate;
		this.linkedInUrl = linkedInUrl;
	}
	public User() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public boolean isConfirmedSignUp() {
		return confirmedSignUp;
	}
	public void setConfirmedSignUp(boolean confirmedSignUp) {
		this.confirmedSignUp = confirmedSignUp;
	}
	public String getRegCode() {
		return regCode;
	}
	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public boolean isResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(boolean resetPassword) {
		this.resetPassword = resetPassword;
	}
	public Date getResetPasswordDate() {
		return resetPasswordDate;
	}
	public void setResetPasswordDate(Date resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}
	public String getLinkedInUrl() {
		return linkedInUrl;
	}
	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}
	
	
}