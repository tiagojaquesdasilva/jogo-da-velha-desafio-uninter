package pacoteTeste;

import java.util.Scanner;

public class Jogador {
	int jogadorDaVez = -1;
	public void jagar(Tabuleiro tab){
		 Scanner tecla = new Scanner(System.in);
		 System.out.println("-------------");
         
         
         do{
        	 System.out.println("Digite o numero da posição desejada");
             int posicao = tecla.nextInt(); 
        	 
         }while(Tabuleiro.checarposicao(int posicao, int jogadorDaVez ))
    }
}


