package com.alura.impostos;

public class ImpostoMuitoAlto extends Imposto {
	
	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ImpostoMuitoAlto() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculaOutroImposto(orcamento);
	}

}
