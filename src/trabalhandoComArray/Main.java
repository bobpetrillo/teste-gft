package trabalhandoComArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		String c = "S";
		while(c.equals("S")) {
			System.out.println("Digite os valores do array:");
			arr.add(sc.nextInt());
			System.out.println("Deseja continuar?(S/N)");
			c = sc.next();
			c = c.toUpperCase();	
		}
		
		sc.close();

		int soma = 0;
		int maior = arr.get(0);
		int menor = arr.get(0);
		double media = 0;
		for (int n : arr) {
			soma += n;
			if (n > maior) maior = n;
			if (n < menor) menor = n;
			media = (double)soma/(arr.size());
		}
		
		System.out.println("Soma de todos os numeros: " + soma);
		System.out.println("Maior numero: " + maior);
		System.out.println("Menor numero: " + menor);
		System.out.println("Media: " + media);
		
	}

}
