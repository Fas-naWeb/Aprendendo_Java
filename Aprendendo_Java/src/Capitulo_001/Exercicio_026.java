package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 20/02/2021 
*/
public class Exercicio_026 {

	public static void main(String[] args) {
/*
		(Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resul-
		tado. [Dica: utilize o operador de resto.]
*/
		Scanner entradas = new Scanner(System.in);
		System.out.println("Entre com o primeiro valor:");
		int valor1 = entradas.nextInt();
		

		System.out.println("Entre com o segundo valor:");
		int valor2 = entradas.nextInt();
		
		if(valor1 % valor2 == 0) {
			System.out.println("Os valores digitados são multiplos.");
		}
		
	}

}
