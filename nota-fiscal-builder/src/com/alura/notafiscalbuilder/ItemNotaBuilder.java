package com.alura.notafiscalbuilder;

public class ItemNotaBuilder {

	private String nome;
	
	private double valor;
	
	public ItemNotaBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public ItemNotaBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemNota build() {
		return new ItemNota(nome, valor);
	}
}
