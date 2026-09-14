package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		/*
		 * O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
		 */
		
		/*
		 * RESUMO: custo carro novo = (custo de fabrica + impostos ) + percentual distribuidor
		 * IMPOSTOS: 45%
		 * PERCENTUAL DISTRIBUIDOR: 28%
		 */
		
		double custoFabrica;
		double impostos = 0.45;
		double percentualDistribuidor = 0.28;
		double valorComImpostos;
		double valorTotal;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o custo do veículo: R$");
		custoFabrica = sc.nextDouble();
		
		sc.close();
		
		valorComImpostos = custoFabrica + (custoFabrica * impostos);
		valorTotal = valorComImpostos + (valorComImpostos * percentualDistribuidor);
		
		System.out.println("O custo deste veículo para o consumidor é de "+ConverterReal.converter(valorTotal));
		
	}
}