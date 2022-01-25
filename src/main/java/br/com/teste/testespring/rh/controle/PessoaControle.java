package br.com.teste.testespring.rh.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.teste.testespring.rh.dominio.PessoaRepositorio;

/*
 * CLASSE REPONSAVEL POR INFORMAR PRO FRAMEWORK QUANDO ELE DEVE RESPONDER AS REQUISIÇÕES
 */

@Controller
public class PessoaControle {
	
	private PessoaRepositorio pessoaRepo;
	
	public PessoaControle(PessoaRepositorio pessoaRepositorio) {
		this.pessoaRepo = pessoaRepositorio;
	}
	//Busca a classe que está mapeando
	@GetMapping("/rh/pessoas")
	public String pessoas(Model model) {
		model.addAttribute("listaPessoas",pessoaRepo.findAll());
		return "rh/pessoas/index";// Envia para o template especificado essas informações
	}
}
