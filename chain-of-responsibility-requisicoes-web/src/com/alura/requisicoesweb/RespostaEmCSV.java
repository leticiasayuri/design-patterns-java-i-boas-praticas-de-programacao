package com.alura.requisicoesweb;

public class RespostaEmCSV implements Resposta {

	private Resposta proximaResposta;
	
	public RespostaEmCSV(Resposta proximaResposta) {
		setProximaResposta(proximaResposta);
	}

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			proximaResposta.responde(requisicao, conta);
		}
	}

	@Override
	public void setProximaResposta(Resposta proximaResposta) {
		this.proximaResposta = proximaResposta;
	}
}
