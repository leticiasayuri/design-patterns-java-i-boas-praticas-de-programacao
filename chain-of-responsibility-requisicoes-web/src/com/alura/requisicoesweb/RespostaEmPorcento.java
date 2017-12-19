package com.alura.requisicoesweb;

public class RespostaEmPorcento implements Resposta {
	
	private Resposta proximaResposta;
	
	public RespostaEmPorcento(Resposta proximaResposta) {
		setProximaResposta(proximaResposta);
	}
	
	public RespostaEmPorcento() {
		this.proximaResposta = null;
	}

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else if (proximaResposta != null) {
			proximaResposta.responde(requisicao, conta);
		} else {
			throw new RuntimeException("Não foi encontrado um formato de resposta que atenda à requisição.");
		}
	}

	@Override
	public void setProximaResposta(Resposta proximaResposta) {
		this.proximaResposta = proximaResposta;
	}

}
