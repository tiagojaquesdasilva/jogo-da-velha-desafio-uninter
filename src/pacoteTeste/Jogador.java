package pacoteTeste;

import java.util.Scanner;

public class Jogador {
    private int jogadorDaVez = -1;

    public void jogar(Tabuleiro tabuleiro) {
        Scanner tecla = new Scanner(System.in);
        int posicao;
        System.out.println("-------------");

        do {

            System.out.println("Digite o numero da posição desejada livre:");
            posicao = tecla.nextInt();

        } while (tabuleiro.checarPosicao(posicao, jogadorDaVez));
    }
}


