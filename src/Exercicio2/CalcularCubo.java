package Exercicio2;

import java.util.Scanner;

public class CalcularCubo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int intervaloInicial = 0, intervalorFinal = 0;
		System.out.println("Digite um número inteiro");
		intervaloInicial = scn.nextInt();
		System.out.println("Digite outro número inteiro");
		intervalorFinal = scn.nextInt();
		for(int i=intervaloInicial; i <= intervalorFinal; i++) {
			System.out.println("Cubo de "+i+":"+i*i*i);
		}
		
	}

}
