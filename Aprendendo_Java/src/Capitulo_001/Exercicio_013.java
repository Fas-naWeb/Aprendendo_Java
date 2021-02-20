package Capitulo_001;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 19/02/2021 
*/
public class Exercicio_013 {
/*
 	Declare a ordem de avaliação dos operadores em cada uma das seguintes instruções Java e mostre o valor de x depois que cada instrução
 	é realizada:
	a) x = ,
	   x = 7 + 18 / 2 -1;
	   x = 7 + 9 - 1;
	   x = 16 - 1
	   x = 15
	   R:Da esquerda para a direita x = 15
	   
	b) x = 2 % 2 + 2 * 2 - 2 / 2;
	   x = 0 + 4 - 1
	   x = 4 - 1
	   x = 3
	   R:Da esquerda para a direita x = 3
	   
	c) x = (3 * 9 * (3 + (9 * 3 / (3))));
	   x = (3 * 9 * (3 + (9 * 3 / 3)));
	   x = (3 * 9 * (3 + (27 / 3)));
	   x = (3 * 9 * (3 + 9));
	   x = (3 * 9 * 12);
	   x = (27 * 12);
	   x = 324
	   R:Da esquerda para a direita x = 324
*/
	public static void main(String[] args) {
		System.out.printf("a) = %d\t",7 + 3 * 6 / 2 - 1);
		System.out.printf("b) = %d\t",2 % 2 + 2 * 2 - 2 / 2);
		System.out.printf("c) = %d",(3 * 9 * (3 + (9 * 3 / (3)))));
	}
}
