package backend;

import java.util.Scanner;

public class bcinco {
    public boolean escolher(int escolha) {
	        switch (escolha) {

	        case 1:
	            System.out.println("Reiniciando o Jogo.");
	            return true;
	        case 2:
	            System.out.println("Encerrando o Jogo.");
	            return true;
	            
	        default:
	            System.out.println("Opção inválida" + "\n" + "Por favor, escolha uma ação válida.");
	        }
	        return false; // Caso nenhuma das opções acima tenha sido escolhida ele cai aqui nesse "return false", fazendo com que o while rode novamente

	    }

	public int menu() {
		System.out.println("Deseja Jogar Novamente? \n" + "1 - Sim 2 - Não");
		Scanner sc = new Scanner(System.in);

        int escolha = sc.nextInt();

        return escolha; // retorna o numero que o usuário escreveu
	}
}