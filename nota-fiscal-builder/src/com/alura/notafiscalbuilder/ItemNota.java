package com.alura.notafiscalbuilder;

public class ItemNota {
	
	private String nome;
	
	private double valor;
	
	public ItemNota(String nome, double valor) {
		setNome(nome);
		setValor(valor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
