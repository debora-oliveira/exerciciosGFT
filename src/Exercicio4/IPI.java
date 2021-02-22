package Exercicio4;

public class IPI implements Imposto{

	@Override
	public double calculaImposto(double valor) {
		double ipi = 0;
		if(valor < 25000) {
			ipi = (0.05 * valor);
		}else {
			ipi = (0.10 * valor);
		}
		
		return ipi;
	}

}
