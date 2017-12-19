package com.alura.requisicoesweb;

public interface Resposta {

	void responde(Requisicao requisicao, Conta conta);
	
	void setProxima(Resposta resposta);
}
