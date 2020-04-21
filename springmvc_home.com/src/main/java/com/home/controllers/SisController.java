package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

	@ResponseBody
	@RequestMapping("/makeupkit")
	public String getMakeUpKit() {
		return "Hey man.. Here is your Makeup Kit";
	}

	@ResponseBody
	@RequestMapping("/book")
	public String getBooks() {
		System.out.println("This is getBook() ");
		return "Hey man.. Here is your Math book";
	}
}
