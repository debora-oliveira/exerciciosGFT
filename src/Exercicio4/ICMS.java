package Exercicio4;

public class ICMS implements Imposto{

	@Override
	public double calculaImposto(double valor) {
		double icms = (0.3*valor);
		return icms;
	}
	
}
