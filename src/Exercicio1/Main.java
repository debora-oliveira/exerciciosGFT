package Exercicio1;

public class Main {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setNome("Banana");
		produto1.setValor(0.99);
		produto1.setTipo(2);

		Produto produto2 = new Produto();
		produto2.setNome("Energético");
		produto2.setValor(5.49);
		produto2.setTipo(3);

		Produto produto3 = new Produto();
		produto3.setNome("Arroz");
		produto3.setValor(20.00);
		produto3.setTipo(1);

		Produto produto4 = new Produto();
		produto4.setNome("Chocolate");
		produto4.setValor(4.50);
		produto4.setTipo(1);

		Produto produto5 = new Produto();
		produto5.setNome("Leite");
		produto5.setValor(3.73);
		produto5.setTipo(3);

		Produto produto6 = new Produto();
		produto6.setNome("Abacaxi");
		produto6.setValor(2.40);
		produto6.setTipo(2);

		Caixa caixa = new Caixa();
		
		double valorFinalP1 = caixa.calculaValorFinal(produto1, 3);
		double valorFinalP2 = caixa.calculaValorFinal(produto2, 7);
		double valorFinalP3 = caixa.calculaValorFinal(produto3, 1);
		double valorFinalP4 = caixa.calculaValorFinal(produto4, 20);
		double valorFinalP5 = caixa.calculaValorFinal(produto5, 3);
		double valorFinalP6 = caixa.calculaValorFinal(produto6, 4);
		System.out.println("Valor final: "+valorFinalP1+ produto1.getNome());
		System.out.println("Valor final: "+valorFinalP2+ produto2.getNome());
		System.out.println("Valor final: "+valorFinalP3+ produto3.getNome());
		System.out.println("Valor final: "+valorFinalP4+ produto4.getNome());
		System.out.println("Valor final: "+valorFinalP5+ produto5.getNome());
		System.out.println("Valor final: "+valorFinalP6+ produto6.getNome());
	}

}
