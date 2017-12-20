package com.alura.filtros.contas;

import java.util.ArrayList;
import java.util.List;

public class FiltroMenorQueCemReais extends Filtro {
	
	public FiltroMenorQueCemReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroMenorQueCemReais() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<>();
		
		for (Conta conta : contas) {
			if (conta.getSaldo() < 100.0) {
				contasFiltradas.add(conta);
			}
		}
		
		contasFiltradas.addAll(proximoFiltro(contas));
		
		return contasFiltradas;
	}

}
