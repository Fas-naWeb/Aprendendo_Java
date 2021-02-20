package Capitulo_001;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 13/02/2021 
*/
import java.util.Scanner;

public class Exercicio_006 {

	public static void main(String[] args) {
		 //Declare que um programa calculará o produto de três inteiros.
	    Scanner entradas = new Scanner(System.in);
	     int x,y,z, result;
	     
	     System.out.println("Entre com o primeiro valor inteiro:");
	     x = entradas.nextInt();
	     
	     System.out.println("Entre com o segundo valor inteiro:");
	     y = entradas.nextInt();
	     
	     System.out.println("Entre com o terceiro valor inteiro:");
	     z = entradas.nextInt();
	     
	     result = x * y * z;
	     
	     System.out.printf("Produto é: %d",result);

	}

}
