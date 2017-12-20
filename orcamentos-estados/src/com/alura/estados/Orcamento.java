package com.alura.estados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	protected double valor;
	
	private List<Item> itens;
	
	protected EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento(double valor) {
		setValor(valor);
		this.itens = new ArrayList<>();
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public boolean existeItem(String nomeItem) {
		for (Item item : itens) {
			if (item.getNome().equals(nomeItem)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
