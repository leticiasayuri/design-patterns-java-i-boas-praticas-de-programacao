package com.alura.notafiscalbuilder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	
	private String cnpj;
	
	private Calendar dataEmissao;
	
	private double valorBruto;
	
	private double impostos;
	
	private List<ItemNota> itens;
	
	private String observacoes;
	
	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmissao, 
					  double valorBruto, double impostos, List<ItemNota> itens, 
					  String observacoes) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public double getValorBruno() {
		return valorBruto;
	}

	public void setValorBruno(double valorBruno) {
		this.valorBruto = valorBruno;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public List<ItemNota> getItens() {
		return itens;
	}

	public void setItens(List<ItemNota> itens) {
		this.itens = itens;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
