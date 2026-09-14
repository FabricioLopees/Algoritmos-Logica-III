package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em dólar (US$). 
		 * O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com ousuário;
		 */
		
		double cotacaoDolarReal;
		double dolares;
		double reais;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cotação do Dólar atual: ");
		cotacaoDolarReal = sc.nextDouble();
		
		System.out.print("Digite a quantidade de dólares: ");
		dolares = sc.nextDouble();
		
		sc.close();
		
		reais = cotacaoDolarReal * dolares;
		
		System.out.println("O valor convertido é "+ConverterReal.converter(reais));
	}

}
