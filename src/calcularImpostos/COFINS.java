package calcularImpostos;

public class COFINS implements Imposto {

	@Override
	public double calculaImposto(double valor) {
		if(valor > 17000) {
			valor = valor * 0.08;
			return valor;
			
		}
		else {
			return 0;
		}
	}

}
