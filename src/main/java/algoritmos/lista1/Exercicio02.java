package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		float num1 = sc.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float num2 = sc.nextFloat();
		
		sc.close();
		
		float soma = num1 + num2;
		float subtracao = num1 - num2;
		float multiplicacao = num1 * num2;
		float divisao = num1 / num2;
		
		System.out.println("Soma: "+soma);
		System.out.println("Subtração: "+subtracao);
		System.out.println("Multiplicação: "+multiplicacao);
		System.out.println("Divisão: "+divisao);
		
	}
}
