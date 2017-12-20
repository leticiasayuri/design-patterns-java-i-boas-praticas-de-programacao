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
	
	public NotaFiscalBuilder naData(Calendar data) {
		this.dataEmissao = data;
		return this;
	}
	
	public NotaFiscalBuilder com(ItemNota item) {
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
		Calendar data = dataEmissao == null ? Calendar.getInstance() : dataEmissao;
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, itens, observacoes);
	}
}
