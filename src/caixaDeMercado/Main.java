package caixaDeMercado;

public class Main {

	public static void main(String[] args) {
		Produto banana = new Produto("Banana", 0.99, 2);
		Produto energ = new Produto("Energetico", 5.49, 3);
		Produto arroz = new Produto("Arroz", 20.00, 1);
		Produto chocolate = new Produto("Chocolate", 4.50, 1);
		Produto leite = new Produto("Leite", 3.73, 3);
		Produto abacaxi = new Produto("Abacaxi", 2.40, 2);
		
		Caixa caixa = new Caixa();
		
		System.out.println("Nome: " + banana.getNome() + "\nValor total: " 
				+ String.format("%.2f", caixa.calculaValorFinal(banana, 3)));
		System.out.println("Nome: " + energ.getNome() + "\nValor total: " 
				+ String.format("%.2f", caixa.calculaValorFinal(energ, 3)));
		System.out.println("Nome: " + arroz.getNome() + "\nValor total: " 
				+ String.format("%.2f", caixa.calculaValorFinal(arroz, 3)));
		System.out.println("Nome: " + chocolate.getNome() + "\nValor total: " 
				+ String.format("%.2f", caixa.calculaValorFinal(chocolate, 3)));
		System.out.println("Nome: " + leite.getNome() + "\nValor total: " 
				+ String.format("%.2f", caixa.calculaValorFinal(leite, 3)));
		System.out.println("Nome: " + abacaxi.getNome() + "\nValor total: " 
				+ String.format("%.2f", caixa.calculaValorFinal(abacaxi, 3)));
		
		
	}

}
