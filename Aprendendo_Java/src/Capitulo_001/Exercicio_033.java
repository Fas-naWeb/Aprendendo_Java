package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 21/02/2021 
*/
public class Exercicio_033 {
/*
	(Calculadora de índice de massa corporal) Introduzimos a calculadora de índice de massa corporal (IMC) no Exercício 1.10. As fór-
	mulas para calcular o IMC são
	IMC =
	pesoEmLibras × 703
	alturaEmPolegadas 2
	ou
	IMC =
	pesoEmQuilogramas
	alturaEmMetros 2
	Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se preferir, o peso em quilogra-
	mas e a altura em metros) e, então, calcule e exiba o índice de massa corporal dele. Além disso, que exiba as seguintes informações do De-
	partment of Health and Human Services/National Institutes of Health, assim o usuário pode avaliar o seu IMC:
	BMI VALUES
	Underweight: less than 18.5
	Normal:
	between 18.5 and 24.9
	Overweight: between 25 and 29.9
	Obese:
	30 or greater
	[Nota: neste capítulo, você aprendeu a utilizar o tipo int para representar números inteiros. Os cálculos de IMC, quando feitos com
	valores int , produzirão resultados com números inteiros. No Capítulo 3, você aprenderá a utilizar o tipo double para representar números
	com pontos decimais. Quando os cálculos de IMC são realizados com double s, eles produzirão números com pontos decimais — esses são
	chamados de números de “ponto flutuante”.]
*/
	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		double peso = 0;
		double altura = 0;
		
		System.out.println("========================= CALCULO DO IMC ==============================");
		
		System.out.print("DIGITE SEU PESO:");
		peso = entradas.nextDouble();
		
		System.out.print("DIGITE SUA ALTURA:");
		altura = entradas.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println("\n");
		System.out.printf("IMC = %.2f\n\n",imc);
		
		System.out.println("\t\tA INTERPRETAÇÃO DO IMC");
		System.out.print("-----------------------------------------------------\n");
		System.out.println("  CLASSIFICAÇÃO\t\tOBESIDADE\t\t(GRAU)\n");
		System.out.println("  QUE 18,5\t\tMAGREZA\t\t\t0 ");
		System.out.println("  ENTRE 18,5 E 24,9\tNORMAL\t\t\t0 ");
		System.out.println("  ENTRE 25,0 E 29,9\tSOBREPESO\t\tI ");
		System.out.println("  ENTRE 30,0 E 39,9\tOBESIDADE\t\tII ");
		System.out.println("  MAIOR QUE 40,0\tOBESIDADE GRAVE\t\tIII ");

	}

}
