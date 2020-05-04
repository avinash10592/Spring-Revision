package com.practice.dao;

import java.util.List;

import com.practice.api.Product;

public interface ProductDao {

	public int addProduct(Product p);

	public List<Product> getProducts();

	public int editProduct(Product p);

	public Product getProductById(int pid);

	public int deleteProduct(int pid);

//	public int saveOrUpdate(Product p);

}
