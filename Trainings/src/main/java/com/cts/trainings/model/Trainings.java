package com.cts.trainings.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "trainings")
public class Trainings {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String status;
private int progress;
private float commision;
private int rating;
private float avgrating;
private Date startdate;
private Date enddate;
private String startime;
private String endtime;
private int amountreceived;
private long userId;
private String username;
private long mentorId;
private String mentorname;
private long skillId;
private String skillname;
private float fees;
public Trainings(long id, String status, int progress, float commision, int rating, float avgrating, Date startdate,
		Date enddate, String startime, String endtime, int amountreceived, long userId, String username, long mentorId,
		String mentorname, long skillId, String skillname, float fees) {
	super();
	this.id = id;
	this.status = status;
	this.progress = progress;
	this.commision = commision;
	this.rating = rating;
	this.avgrating = avgrating;
	this.startdate = startdate;
	this.enddate = enddate;
	this.startime = startime;
	this.endtime = endtime;
	this.amountreceived = amountreceived;
	this.userId = userId;
	this.username = username;
	this.mentorId = mentorId;
	this.mentorname = mentorname;
	this.skillId = skillId;
	this.skillname = skillname;
	this.fees = fees;
}

public Trainings() {
	super();
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int getProgress() {
	return progress;
}

public void setProgress(int progrss) {
	this.progress = progrss;
}

public float getCommision() {
	return commision;
}

public void setCommision(float commision) {
	this.commision = commision;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public float getAvgrating() {
	return avgrating;
}

public void setAvgrating(float avgrating) {
	this.avgrating = avgrating;
}

public Date getStartdate() {
	return startdate;
}

public void setStartdate(Date startdate) {
	this.startdate = startdate;
}

public Date getEnddate() {
	return enddate;
}

public void setEnddate(Date enddate) {
	this.enddate = enddate;
}

public String getStartime() {
	return startime;
}

public void setStartime(String startime) {
	this.startime = startime;
}

public String getEndtime() {
	return endtime;
}

public void setEndtime(String endtime) {
	this.endtime = endtime;
}

public int getAmountreceived() {
	return amountreceived;
}

public void setAmountreceived(int amountreceived) {
	this.amountreceived = amountreceived;
}

public long getUserId() {
	return userId;
}

public void setUserId(long userId) {
	this.userId = userId;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public long getMentorId() {
	return mentorId;
}

public void setMentorId(long mentorId) {
	this.mentorId = mentorId;
}

public String getMentorname() {
	return mentorname;
}

public void setMentorname(String mentorname) {
	this.mentorname = mentorname;
}

public long getSkillId() {
	return skillId;
}

public void setSkillId(long skillId) {
	this.skillId = skillId;
}

public String getSkillname() {
	return skillname;
}

public void setSkillname(String skillname) {
	this.skillname = skillname;
}

public float getFees() {
	return fees;
}

public void setFees(float fees) {
	this.fees = fees;
}


}
