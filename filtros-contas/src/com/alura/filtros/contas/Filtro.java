package com.alura.filtros.contas;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	protected Filtro outroFiltro;
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro() {
		this.outroFiltro = null;
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> proximoFiltro(List<Conta> contas) {
		return (outroFiltro == null ? new ArrayList<>() : outroFiltro.filtra(contas));
	}
}
