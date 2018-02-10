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

import com.cadastromv.model.Telefone;
import com.cadastromv.model.service.TelefoneService;

@Path("/telefones")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class TelefoneFacade {
	
	
	@Inject
	private TelefoneService telefoneServ;
	
	@GET
	public List<Telefone> getTelefones() {
		return telefoneServ.getTelefones();
		
	}
	
	@POST
	public Telefone salvarTelefone(Telefone telefone) {
		return telefoneServ.salvarTelefone(telefone);
	}
	
	@PUT
	public void atualizar(Telefone telefone) {
		telefoneServ.alterar(telefone);
		
	}
	
	@DELETE
	public void excluir(@PathParam("id.telefone") Long idTelefone) {
		Telefone telefone = new Telefone();
		telefone.setId(idTelefone);
		
		telefoneServ.excluir(telefone);
	}
	
	/*
	static List<Telefone> listaTelefones = new ArrayList<Telefone>();

	static {
		listaTelefones.add(new Telefone (1, "85", "988554411"));
		listaTelefones.add(new Telefone (2, "85", "988554411"));
		listaTelefones.add(new Telefone (3, "85", "988554411"));
		listaTelefones.add(new Telefone (4, "85", "988554411"));
	
	}
	
	
	@GET
	public List<Telefone> getTelefones() {
		return listaTelefones;
		
	}
	
	@POST
	public Telefone salvar(Telefone telefone) {
		System.out.println("@POST Salvar");
		System.out.println("Id " + telefone.getId());
		System.out.println("DDD " + telefone.getDdd());
		System.out.println("Telefone " + telefone.getNumero());
		
		listaTelefones.add(telefone);
		
		return telefone;
		
	}
	
	@PUT
	public void atualizar(Telefone telefone) {
		System.out.println("@PUT Alterar");
		System.out.println("Id " + telefone.getId());
		System.out.println("DDD " + telefone.getDdd());
		System.out.println("Telefone " + telefone.getNumero());
		
		listaTelefones.remove(telefone);
		listaTelefones.add(telefone);
		
	}
	
	@DELETE
	@Path("/{idTelefone}")
	public void excluir(@PathParam("idTelefone") Long idTelefone){
		System.out.println("@DELETE excluir");
		
		Telefone telefone = new Telefone();
		telefone.setId(idTelefone);
		
		listaTelefones.remove(telefone);
		
	}
	*/
}
