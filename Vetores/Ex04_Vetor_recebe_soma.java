package Vetores;

import java.util.Scanner;

public class Ex04_Vetor_recebe_soma {

	public static void main(String[] args) {
		//vetor de 20 elementos receber e somar todos.
		
		
		int[] vetor = new int[20]; 
		int soma = 0;
		
		Scanner tc = new Scanner(System.in);
		
		
		for(int i = 0; i < 20; i ++) {
			System.out.printf("Digite numero %d/20: ", (i+1));
			vetor[i] = tc.nextInt();
			
			soma = soma + vetor[i];
			
		}
		
		//coloquei para testar
		for(int i = (vetor.length - 1); i >= 0; i--) {
			System.out.println("Ordem inversa: " + vetor[i]);
			
		}
		
		System.out.println("A soma é: " + soma);
		
			
		tc.close();

	}

}
