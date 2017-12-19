package com.alura.impostos;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		System.out.println(valorImposto);
	}
	
}
