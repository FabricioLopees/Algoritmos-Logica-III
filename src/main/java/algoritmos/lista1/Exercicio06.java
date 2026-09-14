package algoritmos.lista1;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * Leia dois valores para as variáveis A e B, efetue as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresente os valores trocados;
		 */

		int a = 85;
		int b = 22;
		int aux;
		
		System.out.println("Inicialmente a variável A está com o valor "+a+" e a variável B está com o valor "+b+".");
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("TROCA EFETUADA COM SUCESSO!");
		System.out.println("Variável A: "+a+"\nVariável B: "+b);
	}

}
