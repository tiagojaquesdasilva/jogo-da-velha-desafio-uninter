package pacoteTeste;

public class Tabuleiro {
    private int[][] casas = new int[3][3];
    private int vencedor = 0;

    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }

    private int checaLinhas() {
        for (int linha = 0; linha < 3; linha++) {

            if ((casas[linha][0] + casas[linha][1] + casas[linha][2]) == -3)
                return -1;
            if ((casas[linha][0] + casas[linha][1] + casas[linha][2]) == 3)
                return 1;
        }

        return 0;

    }

    private int checaColunas() {
        for (int coluna = 0; coluna < 3; coluna++) {

            if ((casas[0][coluna] + casas[1][coluna] + casas[2][coluna]) == -3)
                return -1;
            if ((casas[0][coluna] + casas[1][coluna] + casas[2][coluna]) == 3)
                return 1;
        }

        return 0;

    }

    private int checaDiagonais() {
        if ((casas[0][0] + casas[1][1] + casas[2][2]) == -3)
            return -1;
        if ((casas[0][0] + casas[1][1] + casas[2][2]) == 3)
            return 1;
        if ((casas[0][2] + casas[1][1] + casas[2][0]) == -3)
            return -1;
        if ((casas[0][2] + casas[1][1] + casas[2][0]) == 3)
            return 1;

        return 0;
    }

    public int situacao() {
        if (getVencedor() != 0) return getVencedor();

        int situacao = 0;
        situacao = checaLinhas();

        if (situacao == 0) {
            situacao = checaColunas();
        }

        if (situacao == 0) {
            situacao = checaDiagonais();
        }

        if (situacao != 0) {
            setVencedor(situacao);
        }

        return situacao;
    }

    public boolean checarPosicao(int posicao, int jogadorDaVez) {
        switch (posicao) {
            case 1:
                if (casas[0][0] == 0) {
                    casas[0][0] = jogadorDaVez;
                    return false;
                }
                return true;

            case 2:
                if (casas[0][1] == 0) {
                    casas[0][1] = jogadorDaVez;
                    return false;
                }
                return true;

            case 3:
                if (casas[0][2] == 0) {
                    casas[0][2] = jogadorDaVez;
                    return false;
                }
                return true;

            case 4:
                if (casas[1][0] == 0) {
                    casas[1][0] = jogadorDaVez;
                    return false;
                }
                return true;

            case 5:
                if (casas[1][1] == 0) {
                    casas[1][1] = jogadorDaVez;
                    return false;
                }
                return true;

            case 6:
                if (casas[1][2] == 0) {
                    casas[1][2] = jogadorDaVez;
                    return false;
                }
                return true;

            case 7:
                if (casas[2][0] == 0) {
                    casas[2][0] = jogadorDaVez;
                    return false;
                }
                return true;

            case 8:
                if (casas[2][1] == 0) {
                    casas[2][1] = jogadorDaVez;
                    return false;
                }
                return true;

            case 9:
                if (casas[2][2] == 0) {
                    casas[2][2] = jogadorDaVez;
                    return false;
                }
                return true;

            default:
                return true;

        }
    }

    public void visualizar() {
        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {

                if (casas[linha][coluna] == -1) {
                    System.out.print(" X ");
                }
                if (casas[linha][coluna] == 1) {
                    System.out.print(" O ");
                }
                if (casas[linha][coluna] == 0) {
                    System.out.print("   ");
                }
                if (coluna == 0 || coluna == 1)
                    System.out.print("|");
            }
            System.out.println();
        }
    }

    public void visualizarPosicoes() {
        int cont = 1;

        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(cont);

                if (coluna == 0 || coluna == 1) {
                    System.out.print("|");
                }

                cont++;
            }

            System.out.println();
        }
    }

    public boolean tabuleiroCompleto() {
        for (int linha = 0; linha < 3; linha++)
            for (int coluna = 0; coluna < 3; coluna++)
                if (casas[linha][coluna] == 0)
                    return false;
        return true;
    }
}




