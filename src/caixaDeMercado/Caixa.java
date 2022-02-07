package caixaDeMercado;

public class Caixa {
	public double calculaValorFinal(Produto produto, int qtd) {
		double valorFinal;
		
		valorFinal = produto.getValor() * qtd;
		if(produto.getTipo() == 1) {
			valorFinal = valorFinal - (valorFinal * 0.1);
		}
		else if(produto.getTipo() == 2) {
			valorFinal = valorFinal - (valorFinal * 0.2);
		}
		else {
			if(qtd > 5) valorFinal = valorFinal - (valorFinal * 0.1);
		}
		
		return valorFinal;
	}
}
