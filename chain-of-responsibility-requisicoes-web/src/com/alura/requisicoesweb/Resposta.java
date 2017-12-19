package com.alura.requisicoesweb;

public interface Resposta {

	void responde(Requisicao requisicao, Conta conta);
	
	void setProximaResposta(Resposta proximaResposta);
}
