package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.
		 * Considere fixo o juro da poupança em 0,07% a. m;
		 */
		
		double rendimentoPoupanca = 0.07;
		double valorDepositado;
		double rendimento;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor depositado: R$");
		valorDepositado = sc.nextDouble();

		sc.close();

		rendimento = (valorDepositado * rendimentoPoupanca) + valorDepositado;
		
		System.out.println("Após um mês, o valor investido terá rendido "+ConverterReal.converter(valorDepositado * rendimentoPoupanca)+". Totalizando: "+ConverterReal.converter(rendimento));
	}

}
