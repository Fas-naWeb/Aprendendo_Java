package Capitulo_001;
import java.util.Scanner;
/*
	Autor:Fabiano Alves Santos
	Email:fasnaweb2020@gmail.com
	Data: 13/02/2021 
*/
public class Exercicio_28 {

	public static void main(String[] args) {
/*
		(Diâmetro, circunferência e área de um círculo) Eis uma prévia do que veremos mais adiante. Neste capítulo, você aprendeu sobre
		inteiros e o tipo int . O Java também pode representar números de pontos flutuantes que contêm pontos de fração decimal, como 3,14159.
		Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
		circunferência e área utilizando o valor do ponto flutuante 3,14159 para S . Utilize as técnicas mostradas na Figura 2.7. [Observação: você
		também pode empregar a constante Math.PI predefinida para o valor de S . Essa constante é mais precisa que o valor 3,14159. A classe
		Math é definida no pacote java.lang . As classes nesse pacote são importadas automaticamente, portanto, você não precisa importar
		a classe Math para utilizá-la.] Adote as seguintes fórmulas (r é o raio):
		diâmetro = 2r
		circunferência = 2 S r
		área = S r 2
		Não armazene os resultados de cada cálculo em uma variável. Em vez disso, especifique cada cálculo como o valor de saída em uma
		instrução System.out.printf . Os valores produzidos pelos cálculos de circunferência e área são números de ponto flutuante. A saída
		desses valores pode ser gerada com o especificador de formato %f em uma instrução System.out.printf . Você aprenderá mais sobre
		números de pontos flutuantes no Capítulo 3.
*/      
		Scanner entrada = new Scanner(System.in);
		int raio = 0;
		System.out.println("Entre com o raio da circunferência:");
		raio = entrada.nextInt();
		
		double diametro = 2 * raio;
		double circunferencia = 2 * Math.PI * raio;
		double area = Math.PI * (raio * raio);
		 
		System.out.println("======================= Dados ===========================");
		System.out.printf("Diametro da %f ",diametro);
		System.out.printf("Diametro da %f ",circunferencia);
		System.out.printf("Diametro da %f \n",area);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Com duas casas decimais");
		System.out.printf("Diametro da %.2f ",diametro);
		System.out.printf("Diametro da %.2f ",circunferencia);
		System.out.printf("Diametro da %.2f \n",area);
		System.out.println("-------------------------------------------------------------------");
	}

}
