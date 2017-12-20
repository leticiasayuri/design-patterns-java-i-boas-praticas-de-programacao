package com.alura.notafiscalbuilder;

public class Programa {
	
	public static void main(String[] args) {
		
//		Calendar data = Calendar.getInstance();
//		data.set(2007, 1, 8);
//		
//		NotaFiscal notaFiscal = new NotaFiscalBuilder().paraEmpresa("Alura")
//													   .comCNPJ("147.589.684/0001-10")
//													   .com(new ItemNotaBuilder().comNome("Item 1")
//															   						 .comValor(100.0)
//															   						 .build())
//													   .com(new ItemNotaBuilder().comNome("Item 2")
//															                         .comValor(200.0)
//															                         .build())
//													   .comObservacoes("Observa��es")
//													   .build();		
//		
//		System.out.println("Data Emissao: " + notaFiscal.getDataEmissao());
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());
		builder.adicionaAcao(new Multiplicador(2));
		
		NotaFiscal notaFiscal = builder.paraEmpresa("Alura")
									   .comCNPJ("123456789")
									   .com(new ItemNota("Item 1", 100.0))
									   .com(new ItemNota("Item 2", 200.0))
									   .comObservacoes("Obs")
									   .build();
		
		System.out.println("Valor Bruto da Nota: " + notaFiscal.getValorBruto());
	}
}
