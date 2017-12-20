package com.alura.notafiscalbuilder;

public class Programa {
	
	NotaFiscal notaFiscal = new NotaFiscalBuilder().paraEmpresa("Alura")
												   .comCNPJ("147.589.684/0001-10")
												   .comItem(new ItemNotaBuilder().comNome("Item 1")
														   						 .comValor(100.0)
														   						 .build())
												   .comItem(new ItemNotaBuilder().comNome("Item 2")
														                         .comValor(200.0)
														                         .build())
												   .comObservacoes("Observações")
												   .naDataAtual()
												   .build();

}
