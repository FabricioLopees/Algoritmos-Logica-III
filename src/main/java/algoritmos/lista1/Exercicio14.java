package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite um segundo número: ");
		num2 = sc.nextInt();
		
		sc.close();
		
		if(num1 == num2) {
			System.out.println("Os números são iguais!");
		}else {
			if(num1 > num2) {
				System.out.println("O número "+num1+" é maior que o número "+num2);
			}else {
				System.out.println("O número "+num2+" é maior que o número "+num1);
			}
		}
		
	}

}
