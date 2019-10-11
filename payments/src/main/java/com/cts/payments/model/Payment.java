package com.cts.payments.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long payment_id;
	private String txntype;
	private float amount;
	private String remarks;
	private Long mentor_id;
	private String mentorname;
	private long training_id;
	private String skillname;
	private float totalAmountToMentor;
	public Payment(long payment_id, String txntype, float amount, String remarks, Long mentor_id, String mentorname,
			long training_id, String skillname, float totalAmountToMentor) {
		super();
		this.payment_id = payment_id;
		this.txntype = txntype;
		this.amount = amount;
		this.remarks = remarks;
		this.mentor_id = mentor_id;
		this.mentorname = mentorname;
		this.training_id = training_id;
		this.skillname = skillname;
		this.totalAmountToMentor = totalAmountToMentor;
	}
	
	public Payment()
	{
		super();
	}

	public long getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(long payment_id) {
		this.payment_id = payment_id;
	}

	public String getTxntype() {
		return txntype;
	}

	public void setTxntype(String txntype) {
		this.txntype = txntype;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(Long mentor_id) {
		this.mentor_id = mentor_id;
	}

	public String getMentorname() {
		return mentorname;
	}

	public void setMentorname(String mentorname) {
		this.mentorname = mentorname;
	}

	public long getTraining_id() {
		return training_id;
	}

	public void setTraining_id(long training_id) {
		this.training_id = training_id;
	}

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	public float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}

	public void setTotalAmountToMentor(float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}
	
}