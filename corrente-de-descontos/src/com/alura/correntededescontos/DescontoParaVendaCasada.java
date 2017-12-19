package com.alura.correntededescontos;

public class DescontoParaVendaCasada implements Desconto {
	
	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.existeItem("LAPIS") && orcamento.existeItem("CANETA")) {
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
