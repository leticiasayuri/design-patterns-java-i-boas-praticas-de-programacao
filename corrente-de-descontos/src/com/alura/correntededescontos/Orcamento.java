package com.alura.correntededescontos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	private double valor;
	
	private List<Item> itens;
	
	public Orcamento(double valor) {
		setValor(valor);
		this.itens = new ArrayList<>();
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
}
