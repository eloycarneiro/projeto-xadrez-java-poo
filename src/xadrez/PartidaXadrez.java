package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		configuracaoInicial();
	}
	
	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] partida = 
				new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				partida[i][j] = (PecaXadrez) tabuleiro.peca(i,j);
			}
		}
		
		return partida;
		
	}
	
	private void configuracaoInicial() {
		tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.BRANCAS), new Posicao(2,1));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.PRETAS), new Posicao(0,4));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Cor.BRANCAS), new Posicao(7,4));
	}
}
