package com.alura.relatorios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private String nome;
	
	private String telefone;
	
	private String endereco;
	
	private String email;
	
	private List<Conta> contas;
	
	public Banco() {
		contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Conta> getContas() {
		return Collections.unmodifiableList(contas);
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
