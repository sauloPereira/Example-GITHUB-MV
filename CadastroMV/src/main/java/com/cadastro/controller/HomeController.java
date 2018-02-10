package com.cadastro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(){
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String home(){
		return "index";
	}
	
	
}
