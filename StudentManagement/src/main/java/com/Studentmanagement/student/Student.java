package com.Studentmanagement.student;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDEENT")
public class Student {
	public Student() {
		super();
	}
	@Id
	private int roll_no;
	@Column(name="STUD_NAME")
	private String name;
	@Column(name="STUD_CITY")
	private String city;
	@Column(name="STUD_CONTACT")
	private int contact;
	public int getRoll_no() {
		return roll_no;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public int getContact() {
		return contact;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", city=" + city + ", contact=" + contact + "]";
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public Student(int roll_no, String name, String city, int contact) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.city = city;
		this.contact = contact;
	}
	
}
