package com.productmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productmgmt.Entity.Product;

public interface productrepository extends JpaRepository<Product, Integer> {

}
