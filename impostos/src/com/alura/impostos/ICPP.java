package com.alura.impostos;

public class ICPP implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 500.0) {
			return orcamento.getValor() * 0.05;
		} else {
			return orcamento.getValor() * 0.07;
		}
	}

}
