package com.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.api.Product;
import com.practice.dao.ProductDao;
import com.practice.service.ProductService;

@Service
public abstract class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDAO;

	public void addProduct(Product p) {
		 calculatetaxandFinalPrice(p);
		// calling dao layer
		productDAO.addProduct(p);
	}

	private void calculatetaxandFinalPrice(Product p) {

		double tax = p.getPrice();
		double finalPrice = p.getPrice() + tax;
		p.setTax(tax);
		p.setFinalprice(finalPrice);
	}

}
