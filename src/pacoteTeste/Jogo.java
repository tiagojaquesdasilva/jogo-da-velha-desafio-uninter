package pacoteTeste;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador = new Jogador();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Jogo da velha");
        System.out.println("Escolha a dificuldade 1,2 ou 3:");
        int opcao = teclado.nextInt();

        Computador comp;
        if (opcao == 1) {
            comp = new ComputadorA();
        } else if (opcao == 2) {
            comp = new ComputadorB();
        } else if (opcao == 3) {
            comp = new ComputadorC();
        } else {
            comp = new ComputadorA();
        }

        int vez = 1;
        tabuleiro.visualizar();

        while (tabuleiro.getVencedor() == 0) {
            if (vez == 1) { //Jogador Humano
                jogador.jogar(tabuleiro);
                vez = 2;

            } else if (vez == 2) {
                System.out.println("Jogada Computador");
                comp.jogar(tabuleiro);
                vez = 1;
            }
            tabuleiro.visualizar();
            if (tabuleiro.tabuleiroCompleto()) {
                break;
            }

        }

        if (tabuleiro.getVencedor() > 0) {
            "Lamento, a Máquina venceu :("
        } else if (tabuleiro.getVencedor()  < 0) {
            "Parabéns você venceu!"
        }

        //Verificar a situacao e imprimir mensagem adequada informando quem venceu ou se empatou
    }
}
