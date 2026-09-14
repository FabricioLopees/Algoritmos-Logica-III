package algoritmos.lista1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a distância percorrida (KM): ");
		float distancia = sc.nextFloat();
		
		System.out.print("Digite a quantidade de combustível gasto (Litro(s)): ");
		float litros = sc.nextFloat();
		
		sc.close();
		
		float media = distancia / litros;
		
		System.out.println("A média de consumo é: "+media+" km/l.");
	}
	
}