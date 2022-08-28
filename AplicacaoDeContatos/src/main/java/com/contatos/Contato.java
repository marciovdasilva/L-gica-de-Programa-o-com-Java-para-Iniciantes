package com.contatos;

public class Contato {
	//Teste padrão JavaBean
	//public String id;
	
	private String id;
	private String nome;
	private String telefone;
	
	//Construtor
	public Contato() {
		
	}
	
	public Contato(String id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
