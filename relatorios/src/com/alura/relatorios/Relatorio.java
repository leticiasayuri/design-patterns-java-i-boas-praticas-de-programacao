package com.alura.relatorios;

import java.util.List;

public abstract class Relatorio {

	protected abstract void preencheCabecalho();
	
	protected abstract void preencheRodape();
	
	protected abstract void preencheCorpo(List<Conta> contas);
	
	public void geraRelatorio(List<Conta> contas) {
		preencheCabecalho();
		preencheRodape();
		preencheCorpo(contas);
	}
}
