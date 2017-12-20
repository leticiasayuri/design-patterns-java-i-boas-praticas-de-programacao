package com.alura.notafiscalbuilder;

public class EnviadorDeSms implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando Nota Fiscal por SMS. . .");
	}

}
