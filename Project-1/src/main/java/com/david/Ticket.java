package com.david;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double amount;
	private String expense;
	
	@Column(length = 1000)
	private String desc;
	private Date timestamp;
	@Column(columnDefinition = "default 'pending'")
	private String status;
	
	public Ticket() {
		
	}

	public Ticket(int id, double amount, String expense, String desc, Date timestamp, String status) {
		super();
		this.id = id;
		this.amount = amount;
		this.expense = expense;
		this.desc = desc;
		this.timestamp = timestamp;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getExpense() {
		return expense;
	}

	public void setExpense(String expense) {
		this.expense = expense;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", amount=" + amount + ", expense=" + expense + ", desc=" + desc + ", timestamp="
				+ timestamp + ", status=" + status + "]";
	}
	
	

}
