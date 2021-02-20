package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 19/02/2021 
*/
public class Exercicio_017 {
/*
	(Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
	números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
	em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]
*/
	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Entre com primeiro valor:");
		int valor1 = entradas.nextInt();
		System.out.println("Entre com Segundo valor:");
		int valor2 = entradas.nextInt();
		System.out.println("Entre com terceiro valor:");
		int valor3 = entradas.nextInt();
		System.out.println("\n");
		
		int soma = valor1 + valor2 + valor3;
		int produto = valor1 * valor2 * valor3;
		int media = soma / 3;
		System.out.println("Resultados ===========================================\n");
		System.out.printf("Soma: %d | ",soma);
		System.out.printf("Produto: %d | ",produto);
		System.out.printf("Média: %d | ",media);
		
		if(valor1 > valor2 && valor1 > valor3) {
			System.out.printf("Maior valor digitado: %d | ",valor1);
		}
		if(valor2 > valor1 && valor2 > valor3) {
			System.out.printf("Maior valor digitado: %d | ",valor2);
		}
		if(valor3 > valor2 && valor3 > valor1) {
			System.out.printf("Maior valor digitado: %d | ",valor3);
		}

		
		if(valor1 < valor2 && valor1 < valor3) {
			System.out.printf("Menor valor digitado: %d | ",valor1);
		}
		if(valor2 < valor1 && valor2 < valor3) {
			System.out.printf("Menor valor digitado: %d | ",valor2);
		}
		if(valor3 < valor2 && valor3 < valor1) {
			System.out.printf("Menor valor digitado: %d | ",valor3);
		}
		
	}
}
 