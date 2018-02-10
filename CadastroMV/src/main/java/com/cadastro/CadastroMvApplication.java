package com.cadastro;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CadastroMvApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CadastroMvApplication.class, args);
		
		
		
	}

	/*@Override
	public void run(String... arg0) throws Exception {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("John");
		pessoa1.setCpf("001.234.567-89");
		pessoa1.setEmail("saulo@email.com");
		pessoa1.setDataNascimento("12/05/1675");
		//pessoa1.setEmail("JAdams@gmail.com");
		//Set<UserRole> userRoles = new HashSet<>();
		
		
		pessoaService.createPessoa(pessoa1);
		
	}*/
	
}
