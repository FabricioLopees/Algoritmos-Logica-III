package algoritmos.lista1;

import java.util.concurrent.*;

public class Exercicio17 {

	/*
	 * Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive);
	 */
	
	static int totalNumerosGerados = 0;
	static int totalNumerosDentroDoIntervalo = 0;
	
	static void imprimirNumero(int num) {
		System.out.print(num+"; ");
	}	
	static void validar(int num) {
		
		if(num >= 10 && num <= 150) {
			imprimirNumero(num);
			totalNumerosDentroDoIntervalo++;
		}
		
	}
	static int gerarNumero() {
		// Gera um número aleatório entre -50 e 300
		return ThreadLocalRandom.current().nextInt(-50, 300);
	}
	static void imprimirInfoExtras() {
		System.out.println("\nTotal de números gerados: "+totalNumerosGerados);
		System.out.println("Total de números gerados: "+totalNumerosDentroDoIntervalo);
	}
	static void start() {

		int i = 0;
		while(i < 80) {
			validar(gerarNumero());
			totalNumerosGerados++;
			
			i++;
		}
		
	}
	
	
	public static void main(String[] args) {
		start();
		imprimirInfoExtras();
	}

}
