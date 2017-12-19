package com.alura.correntededescontos;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoParaMaisDeCincoItens();
		Desconto d2 = new DescontoParaOrcamentoMaiorQueQuinhentosReais();
		Desconto d3 = new DescontoParaVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		return d1.desconta(orcamento);
	}
}
