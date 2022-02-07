package calcularImpostos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double valor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		valor = sc.nextDouble();
		sc.close();
		
		ICMS icms = new ICMS();
		IPI ipi = new IPI();
		COFINS cofins = new COFINS();
		
		System.out.println("ICMS: " + (icms.calculaImposto(valor)));
		System.out.println("IPI: " + (ipi.calculaImposto(valor)));
		System.out.println("COFINS: " + (cofins.calculaImposto(valor)));
		
		double total = valor + icms.calculaImposto(valor) + ipi.calculaImposto(valor) + cofins.calculaImposto(valor);
		System.out.println("Valor final: " + total);
	}

}
