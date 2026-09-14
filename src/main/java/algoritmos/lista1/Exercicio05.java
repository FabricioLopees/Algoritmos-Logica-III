package algoritmos.lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
		 * No final informe o nome do aluno e a sua média (aritmética);
		 */
		
		String nome;		
		double nota1,nota2,nota3,media;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
			
		System.out.print("Informe o seu nome: ");
		nome = sc.next();
		
		System.out.print("Informe sua primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Informe sua segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Informe sua terceira nota: ");
		nota3 = sc.nextDouble();
		
		sc.close();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println(nome+", sua média é: "+df.format(media));
		
	}

}
