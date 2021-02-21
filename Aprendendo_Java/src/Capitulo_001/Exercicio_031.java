package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 21/02/2021 
*/
public class Exercicio_031 {
/*
	(Tabela de quadrados e cubos) Utilizando apenas as técnicas de programação que aprendeu neste capítulo, escreva um aplicativo que
	calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:
*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numero\tQuadrado Cubo  ");
		for(int i = 0;i <= 10;i++) {
			System.out.printf("%d\t%d\t %d\n",i,(i * i),(i * i * i));
		}

	}

}
