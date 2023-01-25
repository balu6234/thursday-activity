package com.librarymanagementsystem.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="book")
@Builder
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int bookId;
@Column(name="bookName")
private String bookName;
@Column(name="bookPrice")
private String bookPrice;
@Column(name="bookAuthor")
private String bookAuthor;
@Column(name="bookPublication")
private String bookPublication;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="studentId")
private Student student;


}
