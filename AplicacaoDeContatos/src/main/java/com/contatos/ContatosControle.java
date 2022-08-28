package com.contatos;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatosControle {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
//		Contato contato = new Contato();
//		contato.setId("1");
//		contato.setNome("Marcio");
//		contato.setTelefone("(045)95684-8468");
		
		LISTA_CONTATOS.add(new Contato("1", "Marcio", "(045)95684-8468"));
		LISTA_CONTATOS.add(new Contato("2", "Lucelia", "(045)91114-8648"));
		LISTA_CONTATOS.add(new Contato("3", "Luiz", "(045)94684-0168"));
		LISTA_CONTATOS.add(new Contato("4", "Gabriel", "(045)68484-6482"));
		LISTA_CONTATOS.add(new Contato("5", "Joaquim", "(045)56484-4984"));
	}
	
	@GetMapping("/")
	public String index(){
		return "index";
	}
}
