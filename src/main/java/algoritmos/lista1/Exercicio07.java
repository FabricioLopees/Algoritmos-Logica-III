package algoritmos.lista1;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
		 * Afórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
		 */
		
		double celsius = 21;
		double fahrenheit = (9*celsius+160)/5;
		
		System.out.println("Temperatura (C°): "+celsius);
		System.out.println("Temperatura (F°): "+fahrenheit);
		
	}

}
