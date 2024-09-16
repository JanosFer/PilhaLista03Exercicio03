package controller;

import br.com.jonas.estruturas.PilhaString;

public class PalindromoController {
	public PalindromoController() {
		super();
	}
	
	public void invertePalavra(String palavra) {
		PilhaString p = new PilhaString();
		String palavraInvertida = "";
		
		for(int i = 0; i < palavra.length(); i++) {
			String letra = "" + palavra.charAt(i);
			p.push(letra);
		}
		
		while(!p.isEmpty()) {
			try {
				palavraInvertida += p.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		if(comparaPalavras(palavra, palavraInvertida)) {
			System.out.println("A palavra " + palavra + " é um palíndromo!");
		}else {
			System.out.println("A palavra " + palavra + " não é um palíndromo!");
		}
	}
	
	public boolean comparaPalavras(String palavra, String palavraInvertida) {
		if(palavra.equals(palavraInvertida)) {
			return true;
		}
		return false;
	}
}
