package contarLetras;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(contarLetrasDaUltimaPalavra("Na minha m�quina funciona"));
		System.out.println(contarLetrasDaUltimaPalavra("Eu posso pular o teste"));
		System.out.println(contarLetrasDaUltimaPalavra("Isso n�o deve demorar"));

	}
	
	private static int contarLetrasDaUltimaPalavra(String s) {
		String[] str = s.split(" "); 
		return str[str.length - 1].length();
	}

}
