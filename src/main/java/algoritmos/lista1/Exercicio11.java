package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
		 * Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
		 */
		
		double percentualRevenda;
		double valorDeCusto;
		double valorRevenda;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de custo do produto: R$");
		valorDeCusto = sc.nextDouble();
		
		System.out.print("Informe a margem de revenda (%): ");
		percentualRevenda = sc.nextDouble() * 0.01;
		
		sc.close();
		
		// CALCULO
		valorRevenda = valorDeCusto + (valorDeCusto * percentualRevenda);
		
		System.out.println("O valor de revenda deste produto será: "+ConverterReal.converter(valorRevenda));
	}

}
