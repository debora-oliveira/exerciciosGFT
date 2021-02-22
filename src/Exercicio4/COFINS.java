package Exercicio4;

public class COFINS implements Imposto{

	@Override
	public double calculaImposto(double valor) {
		double cofins = 0;
		if(valor > 12000) {
			cofins = (0.08 * valor);
		}
		return cofins;
	}

}
