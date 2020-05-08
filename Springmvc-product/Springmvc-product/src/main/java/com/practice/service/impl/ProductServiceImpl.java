package com.practice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.api.Product;
import com.practice.dao.ProductDao;
import com.practice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDAO;

	@Override
	public void addProduct(Product p) {
		calculatetaxandFinalPrice(p);
		// calling dao layer
		productDAO.addProduct(p);
	}

	private static void calculatetaxandFinalPrice(Product p) {
		double tax = p.getPrice() * 2 / 100;
		double finalPrice = p.getPrice() + tax;
		p.setTax(tax);
		p.setFinalprice(finalPrice);

	}

	@Override
	public List<Product> getProducts() {

		return productDAO.getProducts();
	}

	@Override
	public int editProduct(Product p) {
		// TODO Auto-generated method stub
		return productDAO.editProduct(p);
	}

	@Override
	public Product getProductById(int id) {
		return productDAO.getProductById(id);
	}

	@Override
	public int deleteProduct(int pid) {
		return productDAO.deleteProduct(pid);
		
	}


//	@Override
//	public int saveOrUpdate(Product p) {
//		return productDAO.saveOrUpdate(p);
//
//	}

}
