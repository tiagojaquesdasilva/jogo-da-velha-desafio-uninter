package pacoteTeste;

public class ComputadorC extends Computador {
    public void jogar(Tabuleiro tabuleiro) {
        int posicao = 0;
        int ciclo = 0;

        do {
            if (posicao > 9) {
                ciclo = ciclo + 1;
                posicao = -3 + ciclo;
            }

            posicao = posicao + 3;

        } while (tabuleiro.checarPosicao(posicao, jogadorDaVez));
    }
}
