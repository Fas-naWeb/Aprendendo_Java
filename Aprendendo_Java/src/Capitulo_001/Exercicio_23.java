package Capitulo_001;
import java.util.Scanner;

/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 07/02/2021 
*/

public class Exercicio_23 {
/*
	Escreva instruções para realizar cada uma das tarefas a seguir:
	a) Declare que as variáveis c , thisIsAVariable , q76354 e number serão do tipo int .
	b) Solicite que o usuário insira um inteiro.
	c) Insira um inteiro e atribua o resultado à variável int value . Suponha que a variável Scanner input possa ser utilizada para ler
	um valor digitado pelo usuário.
	d) Imprima “This is a Java program" em uma linha na janela de comando. Use o método System.out.println .
	e) Imprima “This is a Java program" em duas linhas na janela de comando. A primeira deve terminar com Java . Utilize o método
	System.out.printf e dois especificadores de formato %s .
	f) Se a variável number não for igual a 7 , exiba “The variable number is not equal to 7" .
*/
	public static void main(String[] args) {
		
		int c,thisIsAVariable,q76354;
		int number = 3;
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Entre com um valor inteiro:");
		int value = entradas.nextInt();
		
		System.out.println("This is a java program.");
		
		System.out.printf("%s\n%s","This is a java","program.\n\n");
		
		if(number != 7) {
			System.out.println("The variable number is not equal to 7");
		}
	}

}
