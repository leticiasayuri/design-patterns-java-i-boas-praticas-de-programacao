package com.alura.correntededescontos;

public class TestaDescontos {

	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(650.0);
		orcamento.adicionaItem(new Item("CADERNO", 250.0));
		orcamento.adicionaItem(new Item("ESTOJO", 300.0));
		
		double desconto = calculador.calcula(orcamento);
		
		System.out.println(desconto);
	}

}
