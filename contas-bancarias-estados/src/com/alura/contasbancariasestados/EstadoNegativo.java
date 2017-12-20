package com.alura.contasbancariasestados;

public class EstadoNegativo implements EstadoDeUmaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("A Conta se encontra em estado negativo, portanto não aceita saques!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		double saldo = conta.getSaldo();
		saldo += valor * 0.95;
		conta.setSaldo(saldo);
		
		if (conta.getSaldo() > 0.0) {
			mudaEstadoParaPositivo(conta);
		}
	}

	private void mudaEstadoParaPositivo(Conta conta) {
		conta.setEstadoAtual(new EstadoPositivo());
	}
}
