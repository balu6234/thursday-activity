package com.librarymanagementsystem.Entity;

import java.util.ArrayList; 
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Student")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int studentId;
@Column(name="studentName")
private String studentName;
@Column(name="studentAddress")
private String studentAddress;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="BookId")
Book book;

}
