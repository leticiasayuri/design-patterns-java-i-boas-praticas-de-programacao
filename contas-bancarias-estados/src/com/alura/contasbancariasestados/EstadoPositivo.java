package com.alura.contasbancariasestados;

public class EstadoPositivo implements EstadoDeUmaConta {

	@Override
	public void saca(Conta conta, double valor) {
		double saldo = conta.getSaldo();
		saldo -= valor;
		conta.setSaldo(saldo);
		
		if (conta.getSaldo() < 0.0) {
			mudaEstadoParaNegativo(conta);
		}
	}

	@Override
	public void deposita(Conta conta, double valor) {
		double saldo = conta.getSaldo();
		saldo += valor * 0.98;
		conta.setSaldo(saldo);
	}

	private void mudaEstadoParaNegativo(Conta conta) {
		conta.setEstadoAtual(new EstadoNegativo());
	}

}
