package com.alura.filtros.contas;

import java.util.ArrayList;
import java.util.List;

public class FiltroMaiorQueQuinhentosMilReais extends Filtro {

	public FiltroMaiorQueQuinhentosMilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroMaiorQueQuinhentosMilReais() {
		super();
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<>();
		
		for (Conta conta : contas) {
			if (conta.getSaldo() > 500000.0) {
				contasFiltradas.add(conta);
			}
		}
		
		contasFiltradas.addAll(proximoFiltro(contas));
		
		return contasFiltradas;
	}
}
