package com.alura.impostos;

public class IKCV implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() > 500.0 && haItemComValorMaiorQueCemReaisNo(orcamento)) {
			return orcamento.getValor() * 0.10;
		} else {
			return orcamento.getValor() * 0.06;
		}
	}

	private boolean haItemComValorMaiorQueCemReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100.0) {
				return true;
			}
		}
		
		return false;
	}

}
