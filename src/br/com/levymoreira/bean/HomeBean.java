package br.com.levymoreira.bean;

import br.com.levymoreira.util.FacesUtil;

public class HomeBean {
	//Variables	
	private String paginaAtual = "/paginas/BoasVindas.xhtml";
	
	//Constructor default
	public HomeBean(){
		System.out.println("Instancia o bean"+ FacesUtil.getInRequestMap("porra"));
	}

	//Getters and Setters
	public String getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(String paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

}
