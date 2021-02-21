package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 21/02/2021 
*/
public class Exercicio_032 {
/*
	(Valores negativos, positivos e zero) Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos,
	quantos positivos e quantos zeros foram inseridos.
*/
	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
        String[] cardinais = {"primeiro","segundo","terceiro","quarto","quinto"};
        
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;
        
        for(int i = 0; i <= 4;i++) {
        	System.out.printf("Entre com o %s valor:",cardinais[i]);
        	int valor = entradas.nextInt();
        	if(valor > 0) {
        		positivos++;
        	}else if(valor < 0) {
        		negativos++;
        	}else if(valor == 0) {
        		zeros++;
        	}
        }
        System.out.printf("Positivos: %d | Negativos: %d | Zeros: %d",positivos,negativos,zeros);
	}

}
