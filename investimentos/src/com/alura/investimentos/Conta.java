package com.alura.investimentos;

public class Conta {
	
	private double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

}
