package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

	@RequestMapping("/viewProduct")
	public String viewProduct(@ModelAttribute("userReg") Product p) {

		return "productdetails";
	}

}
