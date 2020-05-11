package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	/*
	 * It displays object data into form for the given id. The @PathVariable puts
	 * URL data into variable.
	 */
	@RequestMapping(value = "/editProduct/{pid}")
	public String edit(@PathVariable int pid, Model model) {
		Product p = productService.getProductById(pid);
		model.addAttribute("command", p);
		return "editProduct";
	}

	/* It updates model object. */
	@RequestMapping(value = "/editProduct", method = RequestMethod.POST)
	public String editProduct(@ModelAttribute("product") Product p) {
		productService.editProduct(p);
		return "redirect:/ProductsDetails";
	}

	/* It deletes record for the given id in URL and redirects to /Productdetails */
	@RequestMapping(value = "/deleteProduct/{pid}", method = RequestMethod.GET)
	public String delete(@PathVariable int pid) {
		productService.deleteProduct(pid);
		return "ProductsDetails";
	}

	/* It displays/fetch the updated database table without EDIT/DELETE option */
	@RequestMapping("/viewWithoutEdit")
	public String viewWithoutEdit(Model model) {
		List<Product> list = productService.getProducts();
		model.addAttribute("list", list);
		return "viewWithoutEdit";

	}


}