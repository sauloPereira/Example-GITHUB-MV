package com.cadastro.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cadastro.domain.Pessoa;
import com.cadastro.service.PessoaService;


@Controller
@RequestMapping("/pessoa")
public class PessoaController {
	
	
	@Autowired
	private PessoaService pessoaService;
	
	
	@RequestMapping(value="/addCadastro", method = RequestMethod.GET)
	public String addCadastro(Model model) {
		Pessoa pessoa = new Pessoa();
		model.addAttribute("pessoa", pessoa);
		
		return "addCadastro";
	}


	@RequestMapping(value="/addCadastro", method = RequestMethod.POST)
	public String addCadastroPost(@ModelAttribute("pessoa") Pessoa pessoa, HttpServletRequest request) {
		pessoaService.save(pessoa);
		
		return "redirect:listaCadastros";
	}
	
	
	@RequestMapping("/listaCadastros")
	public String listaCadastros(Model model) {
		List<Pessoa> pessoaList = pessoaService.findAll();
		model.addAttribute("listaCadastro", pessoaList);
		
		return "listaCadastros";
	}
	
	
	@RequestMapping("/editarCadastro")
	public String editarCadastro(@RequestParam("id") Long id, Model model) {
		Pessoa pessoa = pessoaService.findOne(id);
		model.addAttribute("pessoa", pessoa);
		
		return "editarCadastro";
		
	}
	
	@RequestMapping(value="/editarCadastro", method = RequestMethod.POST)
	public String editarCadastroPost(@ModelAttribute("pessoa") Pessoa pessoa, HttpServletRequest request) {
		pessoaService.save(pessoa);
		
		return "redirect:listaCadastros";
	}
	
	
	@RequestMapping(value="/deleteCadastro", method = RequestMethod.POST)
	public String deleteCadastro(@RequestParam("id") String id, Model model) {
		pessoaService.removeCadastro(Long.parseLong(id.substring(10)));
		List<Pessoa> pessoaList = pessoaService.findAll();
		model.addAttribute("listaCadastro", pessoaList);
		
		return "redirect:/pessoa/listaCadastros";
	}
	
	
	/*
	@Autowired
	private PessoaService pessoaService;
	
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}


	@RequestMapping("/addCadastro")
	public String addCadastro(Model model) {
		Pessoa pessoa = new Pessoa();
		model.addAttribute("pessoa", pessoa);
		
		
		return "addCadastro";
	}
	
	
	@RequestMapping(value="/addCadastro", method = RequestMethod.POST)
	public String addCadastroPost(@ModelAttribute("pessoa") Pessoa pessoa, HttpServletRequest request) {
		pessoaService.save(pessoa);
		
		return "addCadastro";
	}
	
	
	@RequestMapping("/listaCadastros")
	public String listaCadastros(Model model) {
		Pessoa pessoa = new Pessoa();
		model.addAttribute("pessoa", pessoa);
		return "listaCadastros";
	}
	
	@RequestMapping("/editarCadastro")
	public String editarCadastro(Model model) {
		Pessoa pessoa = new Pessoa();
		model.addAttribute("pessoa", pessoa);
		
		return "editarCadastro";
		
	}
	
	*/
	
}
