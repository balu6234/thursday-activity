package com.productmgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productmgmt.Entity.Product;
import com.productmgmt.serviceimpl.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
 ProductServiceImpl prs;
 @PostMapping("/Product")
 int saveProduct(@RequestBody Product product)
 {
	 prs.save(product);
	 return product.getProductId();
 }
 @DeleteMapping("/product/{ProductId}")
 void deleteProduct(@PathVariable("ProductId") int productId)
 {
	 prs.delete(productId);
 }
 @PutMapping("/Product/{ProductId}")
 void updateBook(@RequestBody Product product,@PathVariable("ProductId")int ProductId)
 {
 	prs.update(product, ProductId);  			
  }
}