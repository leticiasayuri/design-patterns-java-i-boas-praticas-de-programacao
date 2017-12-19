package com.alura.impostos;

public class IKCV extends TemplateParaImpostoCondicional {

	private boolean haItemComValorMaiorQueCemReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100.0) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() > 500.0 && haItemComValorMaiorQueCemReaisNo(orcamento));
	}

}
