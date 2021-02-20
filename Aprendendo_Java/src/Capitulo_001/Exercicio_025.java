package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 20/02/2021 
*/
public class Exercicio_025 {

	public static void main(String[] args) {
/*
   (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
    de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
*/ 
	Scanner entradas = new Scanner(System.in);
	int valor = 0;
	System.out.println("Entre com um valor inteiro:");
	valor = entradas.nextInt();
	
	if(valor % 2 == 0) {
		System.out.println("O valor digitado é par.");
	}else {
		System.out.println("O valor digitado é impar.");
	}
	
   }
}