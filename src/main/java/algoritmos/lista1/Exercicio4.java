package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Olá! Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Informe o seu salário fixo em reais (R$): ");
		float salario = sc.nextFloat();
		
		System.out.print("Informe o valor vendido este mês (R$): " );
		float vendas = sc.nextFloat();

		sc.close();
		
		float comissao = vendas * 0.15f;
		float salarioTotal = salario + comissao;
        
        System.out.println("--------------------------------------------");
        
		System.out.println(nome+", sua comissão será de "+ConverterReal.converter(comissao)+"\nO seu salário fixo é "+ConverterReal.converter(salario)+"\nNo total você receberá "+ConverterReal.converter(salarioTotal));
	}

}
