package com.productmgmt.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmgmt.Entity.Product;
import com.productmgmt.repository.productrepository;
import com.productmgmt.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
@Autowired
  productrepository pr;
	@Override
	public Product save(Product p) {
		return pr.save(p);
	}

	@Override
	public void update(Product params, int id) {
       Product P = pr.findById(id).get();
       P.setProductName(params.getProductName());
       P.setProductType(params.getProductType());
       pr.save(P);
	}

	@Override
	public void delete(int id) {
       pr.deleteById(id);		
	}

	@Override
	public Product getProductById(int id) {
		return pr.findById(id).get();
	}

}
