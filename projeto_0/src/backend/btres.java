package backend;

import java.util.Random;
import java.util.Scanner;
import backend.bcinco;

public class btres {
  public static void main(String[] args) {
	  bcinco esc = new bcinco();
	  boolean val = false;
	  while(val == false) { // Enquanto "val"for "false" o while vai ficar fazendo loop, mas quando se tornar "true" ele vai parar
		  
	  long currentTimeMillis = System.currentTimeMillis();
	  int fase = 1;
	  int tentativasMaximas = 5;
	  int limiteSuperior = 0;
	  int jogarNovamente = 1;
	  int dificuldade;
	  
	  Random random = new Random(currentTimeMillis);
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.print("\nSelecione a dificuldade: ");
	  System.out.print("\n1 - Insano \n2 - Dificil \n3 - Médio \n4 - Facil \n5 - Noob\n");
	  System.out.print("Escolha a Dificuldade: ");
	  dificuldade = scan.nextInt();
	  
 switch(dificuldade) {
	  
	  case 1:
		  tentativasMaximas = 1;
		  break;
		  
	  case 2:
		  tentativasMaximas = 2;
		  break;
		  
	  case 3:
		  tentativasMaximas = 3;
		  break;
		  
	  case 4:
		  tentativasMaximas = 4;
		  break;
		  
	  case 5:
		  tentativasMaximas = 5;
		  break;
		  
	  default:
		  System.out.print("Dados Invalidos!\n");
		  break;
	  }
 while(fase<= 5) {
	 
	 int numeroSecreto;
	 switch(fase) {
	 
	 case 1:
		 limiteSuperior = 20;
		 break;
		 
	 case 2:
		 limiteSuperior = 40;
		 break;
	
	 case 3:
		 limiteSuperior = 60;
		 break;
		 
	 case 4:
		 limiteSuperior = 80;
		 break;
		 
	 case 5:
		 limiteSuperior = 100;
		 break;
	 }
	 
	 numeroSecreto = random.nextInt(limiteSuperior) +1;
	 
	 int chute = 0;
	 int tentativas = 1;
	 
	 System.out.printf("\n===== Fase %d =====\n", fase);
	 
do {
	System.out.printf("Digite um número de 1 à %d:", limiteSuperior);
	chute = scan.nextInt();
	
	
	if(chute <1 || chute > limiteSuperior) {
		System.out.printf("Número Invalido. Digite um núero de 1 a %d", limiteSuperior);
		continue;
	}
	
	if(numeroSecreto == chute) {
		System.out.println("\nParabéns você acertou em cheio!!");
		break;
	}else {
		if(numeroSecreto > chute) {
			System.out.print("\nErrou!\n Seu chute foi Menor!\n");
		}else {
			System.out.print("\nErrou!!\n Seu chute foi Maior!\n");
		}
	}
	
	tentativas++;

} while(tentativas <= tentativasMaximas);

	if(tentativas > tentativasMaximas) {
		System.out.printf("\nvocê excedeu o número maximo de tentativas.\n O número secreto era: %d\n", numeroSecreto);
		break;
	}
	fase++;
 }
 	int opc = esc.menu();
 	val = esc.escolher(opc);
 	if(opc == 1) {
 		btres.main(args); 
 	}else {
 		break;
 	}
}
	  }
  }

