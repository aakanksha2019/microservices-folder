package com.cts.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="email")
	private String username;
	@Column(name="password")
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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