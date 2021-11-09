package com.igti.vendas.dto;

import com.igti.vendas.entities.Cliente;

public class ClienteDTO {
	
	private Long id;
	private String nome;
	private String dataNascimento;	
	
	
	public ClienteDTO(Cliente cliente) {		
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.dataNascimento = cliente.getDataNascimento();
	}
	
	public ClienteDTO(Long id, String nome, String dataNascimento) {		
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
