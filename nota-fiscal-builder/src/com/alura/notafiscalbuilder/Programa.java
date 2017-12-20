package com.alura.notafiscalbuilder;

import java.util.Calendar;

public class Programa {
	
	public static void main(String[] args) {
		
		Calendar data = Calendar.getInstance();
		data.set(2007, 1, 8);
		
		NotaFiscal notaFiscal = new NotaFiscalBuilder().paraEmpresa("Alura")
													   .comCNPJ("147.589.684/0001-10")
													   .comItem(new ItemNotaBuilder().comNome("Item 1")
															   						 .comValor(100.0)
															   						 .build())
													   .comItem(new ItemNotaBuilder().comNome("Item 2")
															                         .comValor(200.0)
															                         .build())
													   .comObservacoes("Observações")
													   .build();		
		
		System.out.println("Data Emissao: " + notaFiscal.getDataEmissao());
	}
}
