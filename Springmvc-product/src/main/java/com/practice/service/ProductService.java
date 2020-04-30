package com.practice.service;

import java.util.List;

import com.practice.api.Product;

public interface ProductService {

	public void addProduct(Product p);

	public List<Product> getProducts();

}
