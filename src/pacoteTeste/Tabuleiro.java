package pacoteTeste;

public class Tabuleiro {
    private int[][] tabuleiro = new int[3][3];
    //-1 - X - Jogador humano
    //1 - O - Computador
    //0 - Espa�o vazio

    public int situacao() {
        //criar logica de verificar quem venceu ou se empatou ou se o jogo continua
        public int checaLinhas () {
            for (int linha = 0; linha < 3; linha++) {

                if ((tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == -3)
                    return -1;
                if ((tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == 3)
                    return 1;
            }

            return 0;

        }

        public int checaColunas () {
            for (int coluna = 0; coluna < 3; coluna++) {

                if ((tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == -3)
                    return -1;
                if ((tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == 3)
                    return 1;
            }

            return 0;

        }

        public int checaDiagonais () {
            if ((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == -3)
                return -1;
            if ((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3)
                return 1;
            if ((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == -3)
                return -1;
            if ((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3)
                return 1;

            return 0;
        }
        return 0;
    }

    public boolean checarposicao(int posicao, int jogadorDaVez) {
        switch (posicao) {
            case 1:
                if (tabuleiro[0][0] == 0) {
                    tabuleiro[0][0] = jogadorDaVez
                }
                return false;

            case 2:
                if (tabuleiro[0][1] == 0) {
                    tabuleiro[0][1] = jogadorDaVez
                }
                return false;

            case 3:
                if (tabuleiro[0][2] == 0) {
                    tabuleiro[0][2] = jogadorDaVez
                }
                return false;

            case 4:
                if (tabuleiro[1][0] == 0) {
                    tabuleiro[1][0] = jogadorDaVez
                }
                return false;

            case 5:
                if (tabuleiro[1][1] == 0) {
                    tabuleiro[1][1] = jogadorDaVez
                }
                return false;

            case 6:
                if (tabuleiro[1][2] == 0) {
                    tabuleiro[1][2] = jogadorDaVez
                }
                return false;

            case 7:
                if (tabuleiro[2][0] == 0) {
                    tabuleiro[2][0] = jogadorDaVez
                }
                return false;

            case 8:
                if (tabuleiro[2][1] == 0) tabuleiro[2][1] = jogadorDaVez
        }
        return false;

        case 9:
        if (tabuleiro[2][2] == 0) {
            tabuleiro[2][2] = jogadorDaVez
        }
        return false;

        default:
        return true;

    }

    public void visualizar() {
        System.out.println();
        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {

                if (tabuleiro[linha][coluna] == -1) {
                    System.out.print(" X ");
                }
                if (tabuleiro[linha][coluna] == 1) {
                    System.out.print(" O ");
                }
                if (tabuleiro[linha][coluna] == 0) {
                    System.out.print("   ");
                }

                if (coluna == 0 || coluna == 1)
                    System.out.print("|");
            }
            System.out.println();
        }

    }

    public boolean tabuleiroCompleto() {
        for (int linha = 0; linha < 3; linha++)
            for (int coluna = 0; coluna < 3; coluna++)
                if (tabuleiro[linha][coluna] == 0)
                    return false;
        return true;
    }
}



