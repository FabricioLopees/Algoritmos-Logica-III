package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 *  A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. 
		 *  Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;
		 */

		double valorCompra;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da compra: R$");
		valorCompra = sc.nextDouble();
		
		sc.close();
		
		System.out.println("O total ficará em 5 parcelas de "+ConverterReal.converter((valorCompra/5)));
	}

}
