package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 19/02/2021 
*/
public class Exercicio_215 {
/*
	(Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
	diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7
*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        int valor = 0;
        
		System.out.print("Digite um valor inteiro:");
		valor = entrada.nextInt();
		
		System.out.printf("%d + %d = %d\n",valor,valor,(valor + valor));
		System.out.printf("%d - %d = %d\n",valor,valor,(valor - valor));
		System.out.printf("%d * %d = %d\n" ,valor,valor,(valor * valor));
		System.out.printf("%d / %d = %d\n",valor,valor,(valor / valor));
		System.out.printf("Resto = %d",(valor % valor));
		
		
	}
}
