package com.alura.relatorios;

import java.util.List;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void preencheCabecalho() {
		System.out.println("Banco ABC");
	}

	@Override
	protected void preencheRodape() {
		System.out.println("Telefone: 36987458");
	}

	@Override
	protected void preencheCorpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular: " + conta.getTitular() 
							   + "Saldo: " + conta.getSaldo());
		}
	}

}
