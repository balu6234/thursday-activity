package com.productmgmt.service;

import com.productmgmt.Entity.Product;

public interface ProductService {
  Product save(Product p);
  void update(Product p,int id);
  void delete(int id);
  Product getProductById(int id);
}
