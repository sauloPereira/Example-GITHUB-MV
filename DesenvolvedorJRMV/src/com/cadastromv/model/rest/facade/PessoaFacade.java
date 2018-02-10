package com.cadastromv.model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cadastromv.model.Pessoa;
import com.cadastromv.model.service.PessoaService;

@Path("/cadastros")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class PessoaFacade {
	
	@Inject
	private PessoaService pessoaServInterf;
	
	@GET
	public List<Pessoa> getPessoa() {
		
		return pessoaServInterf.getPessoa();
	}
	
	@POST
	public Pessoa salvarPessoa(Pessoa pessoa) {
		
		return pessoaServInterf.salvarPessoa(pessoa);
	}
	
	@PUT
	public void atualizar(Pessoa pessoa) {
		
		pessoaServInterf.alterar(pessoa);
	}
	
	@DELETE
	@Path("/{id.cadastro}")
	public void excluir(@PathParam("id.cadastro") Long idCadastro) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(idCadastro);
		
		pessoaServInterf.excluir(pessoa);
		
	}

	/*
	static List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	 
	
	
	static {
		listaPessoas.add(new Pessoa
		(1, "Morgana Pereira Rodrigues", "48612385462", "morgana@email.com"));
		listaPessoas.add(new Pessoa
		(2, "Saulo Pereira da Silva", "12385479458", "14/08/1579", "saulo@email.com"));
		listaPessoas.add(new Pessoa
		(3, "Francisca Joelma Sousa Rodrigues", "84695715812", "07/10/1487", "joelma@email.com"));
		listaPessoas.add(new Pessoa
		(4, "Morgana Khalisee Pereira Rodrigues", "65432198724", "10/09/1965", "khalisee@email.com"));
	}
	
	
	@GET
	public List<Pessoa> getCadastros() {
		return listaPessoas;
	}

	@POST
	public Pessoa salvar(Pessoa pessoa) {
		System.out.println("@POST salvar");
		System.out.println("Código " + pessoa.getId());
		System.out.println("Nome " + pessoa.getNome());
		System.out.println("CPF " + pessoa.getCpf());
//		System.out.println("Data Nasc " + pessoa.getDataNascimento());
		System.out.println("Email " + pessoa.getEmail());
//		System.out.println("Telefone " + pessoa.getTelefones().size());
		
		listaPessoas.add(pessoa);
		return pessoa;
		
	}
	
	@PUT
	public void atualizar(Pessoa pessoa) {
		System.out.println("@PUT Alterar");
		System.out.println("Código " + pessoa.getId());
		System.out.println("Nome " + pessoa.getNome());
		System.out.println("CPF " + pessoa.getCpf());
//		System.out.println("Data Nasc " + pessoa.getDataNascimento());
		System.out.println("Email " + pessoa.getEmail());
//		System.out.println("Telefone " + pessoa.getTelefones().size());
		
		listaPessoas.remove(pessoa);
		listaPessoas.add(pessoa);
		
	}
	
	@DELETE
	@Path("/{idPessoa}")
	public void excluir(@PathParam("idPessoa") Long idPessoa) {
		System.out.println("@DELETE excluir");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(idPessoa);
		
		listaPessoas.remove(pessoa);
		
	}
	*/
	
}

