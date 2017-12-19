package com.alura.requisicoesweb;

public class Conta {
	
	private String titular;
	
	private double saldo;
	
	public Conta(String titular, double saldo) {
		setTitular(titular);
		setSaldo(saldo);
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
}
