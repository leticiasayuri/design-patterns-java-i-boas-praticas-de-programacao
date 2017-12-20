package com.alura.estados;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateParaImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100.0;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> itensNoOrcamento = new ArrayList<>();
		
		for (Item item : orcamento.getItens()) {
			if (itensNoOrcamento.contains(item.getNome())) {
				return true;
			} else {
				itensNoOrcamento.add(item.getNome());
			}
		}
		
		return false;
	}

}
