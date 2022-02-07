package calcularImpostos;

public class ICMS implements Imposto{

	@Override
	public double calculaImposto(double valor) {
		valor = valor * 0.3;
		return valor;
		
		
	}

}
