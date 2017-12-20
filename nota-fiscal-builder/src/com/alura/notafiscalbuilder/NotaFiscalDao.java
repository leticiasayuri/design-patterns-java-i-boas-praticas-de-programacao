package com.alura.notafiscalbuilder;

public class NotaFiscalDao implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvando Nota Fiscal no banco de dados. . .");
	}

}
