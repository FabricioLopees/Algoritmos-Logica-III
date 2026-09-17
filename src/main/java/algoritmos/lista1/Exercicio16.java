package algoritmos.lista1;

import java.util.*;

public class Exercicio16 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. 
		 * Calcular a sua média (aritmética), informar o nome e sua menção:
		 * Aprovado (media >= 7), 
		 * Reprovado (media <= 5)
		 * Recuperação (media entre 5.1 a 6.9);
		 */
		
		double nota1, nota2, nota3, media;
		String nome;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		nome = sc.next();
		
		System.out.print("Digite a primeira nota:" );
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota:" );
		nota2 = sc.nextDouble();
		
		System.out.print("Digite a terceira nota:" );
		nota3 = sc.nextDouble();
		
		sc.close();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 7) {
			// APROVADO
			System.out.println("Parabéns "+nome+"! Você está aprovado.");
		}else {
			if(media >= 5.1) {
				// RECUPERAÇÃO
				System.out.println(nome+", você está de recuperação.");
			}else {
				// REPROVADO
				System.out.println(nome+", infelizmente você está reprovado.");
			}
		}
		
	}
	

}
