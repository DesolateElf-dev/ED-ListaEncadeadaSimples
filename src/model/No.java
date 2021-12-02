package model;

public class No {
	
	private String elemento;
	private No proximo;
	private No cauda;
	
	public No(String elemento, No proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public String getElemento() {
		return elemento;
	}
	
	public void setElemento(String elemento) {
		this.elemento =  elemento;
	}
	
	public No getProximo() {
		return proximo;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	public No getCauda() {
		return cauda;
	}
	
	public void setCauda(No cauda) {
		this.cauda =  cauda;
	}
}
