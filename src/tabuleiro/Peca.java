package tabuleiro;

import xadrez.Cor;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro, Cor cor) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public Peca[][] movimentosPossiveis() {
		return null;
	}
	
	public boolean aliTemMovimentoPossivel() {
		return true;
	}
	
	
	
}
