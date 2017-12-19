package com.alura.relatorios;

import java.util.Date;
import java.util.List;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void preencheCabecalho() {
		System.out.println("Banco ABC\n"
						   + "Telefone: 35147896");
	}

	@Override
	protected void preencheRodape() {
		System.out.println("E-mail: banco@banco.com\n"
						   + new Date().toString());
	}

	@Override
	protected void preencheCorpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular: " + conta.getTitular() 
			                   + "\nAgência: " + conta.getAgencia()
			                   + "\nNúmero: " + conta.getNumero()
			                   + "\nSaldo: " + conta.getSaldo());
		}
	}

}
