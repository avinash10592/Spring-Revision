package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.api.Product;
import com.practice.service.ProductService;

@Controller

public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute("userReg") Product p) {

		return "addproduct";
	}

	@RequestMapping("/result")
	public String processUserRegistration(@ModelAttribute("userReg") Product p) {

		productService.addProduct(p);

		return "result";
	}

	@RequestMapping("/ProductsDetails")
	public String viewProducts(Model model) {
		List<Product> list = productService.getProducts();
		model.addAttribute("list", list);
		return "productdetails";

	}

}
