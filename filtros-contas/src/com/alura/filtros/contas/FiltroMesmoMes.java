package com.alura.filtros.contas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FiltroMesmoMes extends Filtro {
	
	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroMesmoMes() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<>();
		
		for (Conta conta : contas) {
			if (conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) &&
			    conta.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
				contasFiltradas.add(conta);
			}
		}
		
		contasFiltradas.addAll(proximoFiltro(contas));
		
		return contasFiltradas;
	}

}
