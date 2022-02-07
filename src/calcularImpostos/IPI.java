package calcularImpostos;

public class IPI implements Imposto{

	@Override
	public double calculaImposto(double valor) {
		if(valor < 25000) {
			valor = valor * 0.05;
			return valor;
			
		}
		else {
			valor = valor * 0.1;
			return valor;
		}
		
	}

}
