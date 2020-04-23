package com.practice.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {

//		UserRegistrationDTO dto = new UserRegistrationDTO();
//		model.addAttribute("userReg", dto);

		return "user-registration-page";
	}

	@RequestMapping("/registration-success")
	public String processUserRegistration(@ModelAttribute("useReg") UserRegistrationDTO dto) {

		return "registration-success";
	}

}
