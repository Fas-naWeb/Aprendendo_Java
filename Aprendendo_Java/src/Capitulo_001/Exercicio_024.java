package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 20/02/2021 
*/
public class Exercicio_024 {
/*
	(Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
	no grupo. Utilize somente as técnicas de programação que você aprendeu neste capítulo.
*/
	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		String[] cardinais = {"primeiro","segundo","terceiro","quarto","quinto"};
		int valor0 = 0;
		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;
		int valor4 = 0;
		
		for(int i = 0;i <= 5;i++) {
			if(i == 0) {
			 System.out.printf("Entre com o %s valor Inteiro:",cardinais[0]);
		     valor0 = entradas.nextInt();
			}else if(i == 1) {
				System.out.printf("Entre com o %s valor Inteiro:",cardinais[1]);
			    valor1 = entradas.nextInt();
			}else if(i == 2) {
				System.out.printf("Entre com o %s valor Inteiro:",cardinais[2]);
			    valor2 = entradas.nextInt();
			}else if(i == 3) {
				System.out.printf("Entre com o %s valor Inteiro:",cardinais[3]);
			    valor3 = entradas.nextInt();
			}else if(i == 4) {
				System.out.printf("Entre com o %s valor Inteiro:",cardinais[4]);
			    valor4 = entradas.nextInt();
			}
		}
		
		System.out.println("\n");
				
		if(valor0 > valor1 && valor0 > valor2 && valor0 > valor3 && valor0 > valor4) {
			System.out.printf("Maior valor digitado: %d | ",valor0);
		}
		if(valor1 > valor0 && valor1 > valor2 && valor1 > valor3 && valor1 > valor4) {
			System.out.printf("Maior valor digitado: %d | ",valor1 );
		}
		if(valor2 > valor0 && valor2 > valor1 && valor2 > valor3 && valor2 > valor4) {
			System.out.printf("Maior valor digitado: %d | ",valor2);
		}
		if(valor3 > valor0 && valor3 > valor1 && valor3 > valor2 && valor3 > valor4) {
			System.out.printf("Maior valor digitado: %d | ",valor3);
		}
		if(valor4 > valor0 && valor4 > valor1 && valor4 > valor2 && valor4 > valor3) {
			System.out.printf("Maior valor digitado: %d | ",valor4);
		}

		
		if(valor0 < valor1 && valor0 < valor2 && valor0 < valor3 && valor0 < valor4) {
			System.out.printf("Menor valor digitado: %d | ",valor0);
		}
		if(valor1 < valor0 && valor1 < valor2 && valor1 < valor3 && valor1 < valor4) {
			System.out.printf("Menor valor digitado: %d | ",valor1 );
		}
		if(valor2 < valor0 && valor2 < valor1 && valor2 < valor3 && valor2 < valor4) {
			System.out.printf("Menor valor digitado: %d | ",valor2);
		}
		if(valor3 < valor0 && valor3 < valor1 && valor3 < valor2 && valor3 < valor4) {
			System.out.printf("Menor valor digitado: %d | ",valor3);
		}
		if(valor4 < valor0 && valor4 < valor1 && valor4 < valor2 && valor4 < valor3) {
			System.out.printf("Menor valor digitado: %d | ",valor4);
		}

	}

}
