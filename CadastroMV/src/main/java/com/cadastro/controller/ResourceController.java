package com.cadastro.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.service.PessoaService;

@RestController
public class ResourceController {

	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(value="/pessoa/removeList", method=RequestMethod.POST)
	public String removeList(
			@RequestBody ArrayList<String> pessoaIdList, Model model
			){
		
		for (String id : pessoaIdList) {
			String pessoaId =id.substring(10);
			pessoaService.removeCadastro(Long.parseLong(pessoaId));
		}
		
		return "delete success";
	}
}
