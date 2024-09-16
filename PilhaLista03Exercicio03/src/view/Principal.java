package view;

import java.util.Scanner;

import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController pc = new PalindromoController();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe uma palavra: ");
		String palavra = ler.nextLine();
		
		pc.invertePalavra(palavra);
		
		ler.close();
	}
}
