package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 21/02/2021 
*/
public class Exercicio_030 {
/*
  (Separando os dígitos em um inteiro) Escreva um aplicativo que insira o número 42339 que consisti de cinco dígitos a partir do usuário,
  separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, quando o usuário
  digitar o número 42339 , o programa deve imprimir 4   2   3   3   9
*/
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    int valor = 0;
	    System.out.println("Digite o valor 42339:");
	    valor = entrada.nextInt();
	    if(valor != 42339) {
	    	System.out.println("Digite o valor correto");
	    }
	    int recbVl1 = valor / 10000;
	    System.out.printf("%d",recbVl1);
	    
	    int recbVl2 = valor / 1000;
	    recbVl2 = recbVl2 % (recbVl2 - 2);
	    System.out.printf("   %d",recbVl2);
	    
	    int recbVl3 = valor / 100;
	    recbVl3 = recbVl3 % (recbVl3 - 3);
	    System.out.printf("   %d",recbVl3);
	    
	    int recbVl4 = valor / 10;
	    recbVl4 = recbVl4 % (recbVl4 - 3);
	    System.out.printf("   %d",recbVl4);

	    int recbVl5 = valor / 1;
	    recbVl5 = recbVl5 % (recbVl5 - 9);
	    System.out.printf("   %d",recbVl5);
	}

}
