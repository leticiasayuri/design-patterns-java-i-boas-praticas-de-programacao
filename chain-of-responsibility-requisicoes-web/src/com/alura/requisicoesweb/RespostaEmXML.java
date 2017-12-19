package com.alura.requisicoesweb;

public class RespostaEmXML implements Resposta {
	
	private Resposta proximaResposta;

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>"
					           + conta.getTitular()
							   + "</titular><saldo>"
							   + conta.getSaldo()
							   + "</saldo></conta>");
		} else {
			proximaResposta.responde(requisicao, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proximaResposta = resposta;
	}

}
