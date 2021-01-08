package com.codetinkering.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping(value = {"/"})
	public String selectProvider() {

		System.out.println("Select a service provider!");
		return "redirect:/saml/idp/select";
	}


}