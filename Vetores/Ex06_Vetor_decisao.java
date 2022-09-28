package Vetores;

import java.util.Scanner;

public class Ex06_Vetor_decisao {

	public static void main(String[] args) {
		//receber um codigo de numero inteiro e um vetor de 5 posisões.
		//se o codigo for zero, terminar o programa
		//se o codigo for 1 mostrar o vetor na ordem direta
		//se o codigo for 2 mostrar o vetor na ordem inversa
		
		int codigo;
		float[] vetor = new float[5];
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite um numere entre 0 a 2");
		codigo = tc.nextInt();
		
		if(codigo > 0 && codigo <= 2) {
			for(int i = 0; i < 5; i++) {
				System.out.printf("Digite um valor %d/5 com ponto flutuante: ", (i+1));
				vetor[i] = tc.nextFloat();
			}	
			
			if(codigo == 1) {
			    for(int i = 0; i < 5; i++) {
				 	System.out.println("Ordem direta: " + vetor[i]);
				}
			}
			
			if(codigo == 2) {
				for(int i = (vetor.length - 1); i >= 0; i--) {
					System.out.println("Ordem inversa: " + vetor[i]);
				}
			}
		}
		
		tc.close();

	}

}
