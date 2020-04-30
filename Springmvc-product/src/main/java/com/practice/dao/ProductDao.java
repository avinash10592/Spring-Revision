package com.practice.dao;

import java.util.List;

import com.practice.api.Product;

public interface ProductDao {

	public int addProduct(Product p);

	public List<Product> getProducts();

}
