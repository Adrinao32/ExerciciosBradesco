package Estrutura_decisao;

import java.util.Scanner;

public class Ex05_multa_excesso {

	public static void main(String[] args) {
		// Quntidade de peixe limite 50kg. pagar 4,00 de multa por kilo excedido
		
		int peso_peixe = 0, excesso = 0;
		float multa = 0;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Quantidade de peixe pescada: ");
		peso_peixe = tc.nextInt();
		
		if(peso_peixe > 50) {
			excesso = peso_peixe - 50;
			multa = excesso * (float) 4.00;
			
		}
		
		System.out.println("Peso peixe pescado: " + peso_peixe + "KG");
		System.out.println("O Excesso foi de: " + excesso + "KG");
		System.out.printf("Valor da Multa a pagar: %.2f" , multa);
		
		tc.close();
	}

}
