package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
		
		double num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = sc.nextDouble();
		
		sc.close();
		
		if(num >= 100 && num <=200) {
			System.out.println("Este número está no intervalo entre 100 e 200");
		}else {
			System.out.println("Este número não está no intervalo entre 100 e 200");
		}
		
	}

}
