package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	public Employee() {
	super();
	}
	public Employee(int id, String firstName, String lastName, String emailId) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	}
	@Override
	public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + "]";
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getFirstName() {
	return firstName;
	}
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
	public String getLastName() {
	return lastName;
	}
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}

		public String getEmailId() {
		return emailId;
		}
		public void setEmailId(String emailId) {
		this.emailId = emailId;
		}
		@Column(name="firstName")

		private String firstName;
		@Column(name="lastName")
		private String lastName;
		@Column(name="emailId")
		private String emailId;


		}

