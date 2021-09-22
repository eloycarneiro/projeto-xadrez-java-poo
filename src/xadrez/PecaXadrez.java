package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecaXadrez extends Peca {
	
	private Cor cor;

	public PecaXadrez(Tabuleiro tabuleiro) {
		super(tabuleiro);
		this.cor = cor;
	}
}
