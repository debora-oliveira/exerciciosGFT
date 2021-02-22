package Exercicio3;

import java.util.Scanner;

public class EhDivisivel {

	public static void main(String[] args) {
		int numero = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um número:");
		numero = scn.nextInt();
		String divisivel = "";
		if(numero % 3 == 0) {
			divisivel += "3";
		}
		if(numero % 6 == 0) {
			divisivel += ",6";
		}
		if(numero % 7 == 0) {
			divisivel += ",7";
		}
		System.out.println("Divisível por "+divisivel);
				
	}

}
