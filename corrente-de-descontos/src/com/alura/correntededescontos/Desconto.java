package com.alura.correntededescontos;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	
	void setProximo(Desconto proximo);

}
