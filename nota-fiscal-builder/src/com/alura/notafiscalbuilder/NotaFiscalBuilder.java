package com.alura.notafiscalbuilder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	
	private String cnpj;
	
	private Calendar dataEmissao;
	
	private double valorBruto;
	
	private double impostos;
	
	private List<ItemNota> itens = new ArrayList<>();
	
	private String observacoes;
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder naDataAtual() {
		this.dataEmissao = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemNota item) {
		itens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscal build() {
		return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
	}
}
