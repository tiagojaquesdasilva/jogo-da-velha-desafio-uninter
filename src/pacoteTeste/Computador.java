package pacoteTeste;

public class Computador {
    protected int jogadorDaVez = 1;

    public void jogar(Tabuleiro tabuleiro) {
        int posicao = 0;

        do {
            posicao = posicao + 1;

        } while (tabuleiro.checarPosicao(posicao, jogadorDaVez) && posicao <= 9);
    }
}
