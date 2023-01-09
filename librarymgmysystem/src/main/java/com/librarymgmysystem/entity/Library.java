package com.librarymgmysystem.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="new_Library")
public class Library {
@Id
private int Library_Id;
private String Library_Name;
@ManyToOne(cascade=CascadeType.ALL)
Book b;
}
