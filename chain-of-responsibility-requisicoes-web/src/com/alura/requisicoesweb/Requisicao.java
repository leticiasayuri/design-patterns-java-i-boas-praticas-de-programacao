package com.alura.requisicoesweb;

public class Requisicao {
	
	private Formato formato;
	
	public Requisicao(Formato formato) {
		setFormato(formato);
	}	
	
	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}
}
