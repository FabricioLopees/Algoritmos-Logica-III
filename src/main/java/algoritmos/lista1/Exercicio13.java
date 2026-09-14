package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero = sc.nextDouble();
		
		sc.close();
		
		if(numero > 10) {
			System.out.println("Este número é maior que 10");
		}else {
			System.out.println("Este número não é maior que 10");
		}
	}

}
