package algoritmos.lista1;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {

		//	1 - Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
		 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um primeiro número inteiro: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite um segundo número do tipo inteiro: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		System.out.println("O resultado da soma entre os números "+num1+" e "+num2+" é: "+(num1+num2));
	}
	
}
