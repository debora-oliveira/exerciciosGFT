package Exercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite um valor:");
		double valor = scn.nextDouble();
		ICMS icms= new ICMS();
		IPI ipi = new IPI();
		COFINS cofins = new COFINS();
		double icmsIMP = icms.calculaImposto(valor);
		double ipiIMP = ipi.calculaImposto(valor);
		double cofinsIMP = cofins.calculaImposto(valor);
		System.out.println("ICMS:"+icmsIMP);
		System.out.println("IPI:"+ipiIMP);
		System.out.println("COFINS:"+cofinsIMP);
		System.out.println("Valor Final:"+(valor+icmsIMP+ipiIMP+cofinsIMP));
		
	}
}
