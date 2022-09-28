package Vetores;

import java.util.Scanner;

public class Ex03_mostrar_ordem_inverca {

	public static void main(String[] args) {
		//vetor de 10 posições que recebe digitos. mostrar a digitação na ordem inverça
		
		int[] vetor = new int[10];
		
		Scanner tc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite um numero %d / 10 : ", (i+1));
			vetor[i] = tc.nextInt();
			
		}
		
		for (int i = (vetor.length - 1); i >= 0 ; i--) {
			System.out.println("Ordem inversa: " + vetor[i]);
			
		}
		
		tc.close();

	}

}
