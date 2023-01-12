package com.productmgmt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="product_Table")
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int productId;
@Column(name="productName")
private String productName;
@Column(name="producType")
private String productType;
}
