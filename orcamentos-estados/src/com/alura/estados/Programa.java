package com.alura.estados;

public class Programa {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);
		calculador.realizaCalculo(orcamento, icpp);
		calculador.realizaCalculo(orcamento, ikcv);
		
		Imposto impostos = new ISS(new ICMS());
		
		Orcamento orcamentoParaImpostos = new Orcamento(500.0);
		
		System.out.println(impostos.calcula(orcamentoParaImpostos));
		
		Imposto impostoAltoEOutro = new ImpostoMuitoAlto(new ISS());
		
		Orcamento orcamentoParaImpostoAlto = new Orcamento(1000.0);
		
		System.out.println(impostoAltoEOutro.calcula(orcamentoParaImpostoAlto));
	}

}
