package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 19/02/2021 
*/
public class Exercicio_016 {
/*
   (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
	maior seguido pelas palavras “is larger" . Se os números forem iguais, imprima a mensagem “These numbers are equal" . Utilize
	as técnicas mostradas na Figura 2.15.
*/
	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor:");
		int valor1 = entradas.nextInt();
		
		System.out.println("Entre com o segundo valor:");
		int valor2 = entradas.nextInt();
		
		if(valor1 > valor2) {
			System.out.printf("Primeiro valor é maior do que o segundo,%d é > %d",valor1,valor2);
		}else if(valor1 == valor2) {
			System.out.printf("Os valores são iguais,%d é = %d",valor1,valor2);
		}
	}
}
