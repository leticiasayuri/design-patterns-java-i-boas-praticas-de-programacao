package com.alura.impostos;

public class ICPP extends TemplateParaImpostoCondicional {
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICPP() {
		super();
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() < 500.0);
	}

}
