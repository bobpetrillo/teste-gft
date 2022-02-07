package caixaDeMercado;

public class Produto {
	private String nome;
	private double valor;
	private int tipo;
	
	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public int getTipo() {
		return tipo;
	}

	public Produto(String nome, double valor, int tipo) {
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	
}
