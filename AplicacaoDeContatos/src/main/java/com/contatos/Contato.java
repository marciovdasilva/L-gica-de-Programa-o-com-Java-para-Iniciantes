package com.contatos;

public class Contato {
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
	
	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getTelefone() {
		return telefone;
	}
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
