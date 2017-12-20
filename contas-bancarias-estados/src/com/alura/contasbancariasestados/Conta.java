package com.alura.contasbancariasestados;

public class Conta {

	private String titular;
	
	private double saldo;
	
	private EstadoDeUmaConta estadoAtual;
	
	public Conta() {
		setEstadoAtual(new EstadoPositivo());
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public EstadoDeUmaConta getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoDeUmaConta estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	
	//Aqui fazemos com que a classe Conta utilize os estados criados
	//No momento de um saque ou depósito, ela invoca o comportamento que está no estado atual
	public void saca(double valor) {
		estadoAtual.saca(this, valor);
	}
	
	public void deposita(double valor) {
		estadoAtual.deposita(this, valor);
	}
}
