package br.com.teste.testespring;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.teste.testespring.rh.dominio.Pessoa;
import br.com.teste.testespring.rh.dominio.PessoaRepositorio;

/*
 * COMPONENTE PARA INICIALIZAR O BANCO
 * 
 */

@Component
public class PopulacaoInicialBanco implements CommandLineRunner{

	//SPRING BUSCA UMA INSTANCIA E JOGA NESTE ATRIBUTO
	@Autowired
	private PessoaRepositorio pessoaRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Pessoa p1 = new Pessoa("João");
		p1.setDataNascimento(LocalDate.of(1990, 4, 1));
		p1.setEmail("jao@email.com");
		Pessoa p2 = new Pessoa("Maria");
		p2.setDataNascimento(LocalDate.of(1998, 6, 15));
		p2.setEmail("maria@email.com");
		Pessoa p3 = new Pessoa("Jusé");
		p3.setEmail("juse@email.com");
		p3.setDataNascimento(LocalDate.of(1980, 3, 10));
		
		pessoaRepo.save(p1);
		pessoaRepo.save(p2);
		pessoaRepo.save(p3);
	}
	
}
