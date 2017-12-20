package com.alura.contasbancariasestados;

public interface EstadoDeUmaConta {

	void saca(Conta conta, double valor);
	
	void deposita(Conta conta, double valor);
}
