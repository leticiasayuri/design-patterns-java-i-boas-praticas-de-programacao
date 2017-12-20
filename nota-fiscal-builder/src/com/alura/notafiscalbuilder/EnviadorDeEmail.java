package com.alura.notafiscalbuilder;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviando Nota Fiscal por e-mail. . .");
	}

}
