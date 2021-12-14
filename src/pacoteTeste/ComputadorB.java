package pacoteTeste;

public class ComputadorB extends Computador {
    public void jogar(Tabuleiro tabuleiro) {
        int posicao = 0;

        do {
            if (posicao > 9) {
                posicao = -1;
            }

            posicao = posicao + 2;

        } while (tabuleiro.checarPosicao(posicao, jogadorDaVez));
    }
}
