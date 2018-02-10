package com.cadastro.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cadastro.domain.Telefone;
import com.cadastro.service.TelefoneService;

@Controller
@RequestMapping("/pessoa")
public class TelefoneController {
	
	@Autowired
	private TelefoneService telefoneService;
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addTelefone(Model model) {
		Telefone telefone = new Telefone();
		model.addAttribute("telefone", telefone);
		
		return "addCadastro";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addTelefonePost(@ModelAttribute("telefone") Telefone telefone, HttpServletRequest request) {
		telefoneService.updateTelefone(telefone);
		
		return "addCadastro";
	}
	

}
