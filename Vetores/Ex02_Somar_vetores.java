package Vetores;

import java.util.Scanner;

public class Ex02_Somar_vetores {

	public static void main(String[] args) {
		//Ler vetores de 10 posições e fazer soma dos elementos. colocar resultado em terceiro 
		//vetor e mostre o resultado. 

		
		int[] vetor1 = new int[10], vetor2 = new int[10], soma = new int[10];
		
		Scanner tc = new Scanner(System.in);
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um numero para Vetor1: ");
			vetor1[i] = tc.nextInt();
			
			System.out.println("Digite um numero para Vetor2: ");
			vetor2[i] = tc.nextInt();
			
			soma[i] = vetor1[i] + vetor2 [i];
			
			
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("A Soma é: " + soma[i]);
		}
		
		
		tc.close();
			
		
	}

}
