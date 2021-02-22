package Exercicio1;

public class Caixa {
	static double calculaValorFinal(Produto produto, int quantidade) {
		double valorFinal = 0;
		valorFinal = produto.getValor() * quantidade;
		if(produto.getTipo() == 1) {
			valorFinal -= (0.1 * valorFinal); 
		}else if(produto.getTipo() == 2) {
			valorFinal -= (0.2 * valorFinal);
		}else if(produto.getTipo() == 3) {
			if(quantidade > 5) {
				valorFinal -= (0.1 * valorFinal);
			}
		}
		return valorFinal;
	}
}
