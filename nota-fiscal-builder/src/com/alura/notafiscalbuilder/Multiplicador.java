package com.alura.notafiscalbuilder;

public class Multiplicador implements AcaoAposGerarNota {
	
	private double fator;
	
	public Multiplicador(double fator) {
		this.fator = fator;
	}

	public double getFator() {
		return fator;
	}

	public void setFator(double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal notaFiscal) {
		double valorMultiplicado = notaFiscal.getValorBruto() * fator;
		System.out.println("Mutiplicando o valor da Nota Fiscal pelo fator " + fator + ". . .");
		System.out.println("Resultado: " + valorMultiplicado);
	}

}
