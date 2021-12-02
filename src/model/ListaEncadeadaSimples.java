package model;

public class ListaEncadeadaSimples {
	
	No cabeca = null;
	Integer tamanho = 0;
	No cauda = null;
	
	public void adicionaPrimeiroElemento(No no) {
		if (tamanho == 0) {
			cauda = no;
			cabeca = no;
		} else {
			no.setProximo(cabeca);
			cabeca = no;
		}
		tamanho++;
	}
		
	public void adicionaElemento(No no) {
		if (tamanho == 0) {
			cabeca.setProximo(no);
		} else {
			cauda.setProximo(no);
			cauda = no;
		}
		tamanho++;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return  posicao >= 0 && posicao < tamanho;
	}
	
	private No pegaPosicao(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		No atual = cabeca;
		for (int i=0 ; i <posicao-1;i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	public No pegaNo(int posicao) {
		return this.getNo(posicao);
	}
	
	public String pegaElemento(int posicao) {
		return this.pegaNo(posicao).getElemento();
	}
	
	public void adicionaPosicao(int posicao, No no) {
		if (posicao == 0) {
			this.adicionaPrimeiroElemento(cabeca);
		} else {
			if (posicao == tamanho) {
				this.adicionaElemento(no);
			} else {
				No anterior = this.pegaNo(posicao-1);
				No novoNo = new No(no.getElemento(), anterior.getProximo());
				anterior.setProximo(novoNo);
				tamanho++;
			}
		}
	}
	
	public void removeCabeca() {
		if (!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		cabeca = cabeca.getProximo();
		tamanho--;
		if (this.tamanho == 0) {
			
			this.cauda = null;
		}
	}
	
	public String toString() {
		if (tamanho == 0) {
			return "[]";
		}
	}
	
	StringBuilder builder = new StringBuilder("[");
	No atual = cabeca;
	
	for (int i=0 ; i< tamanho-1; i++) {
		builder.append(atual.getElemento());
		builder.append(", ");
		atual = atual.getProximo();
	}
	
	public void verificaInteiros(No no) {
		
	}
	
	public void buscaIterativa(No no) {
		
	}
	
	public void buscaRecurssiva(No no) {
		
	}
	

}
