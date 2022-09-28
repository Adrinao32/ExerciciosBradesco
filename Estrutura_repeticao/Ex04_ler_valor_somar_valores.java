package Estrutura_repeticao;

import java.util.Scanner;

public class Ex04_ler_valor_somar_valores {

	public static void main(String[] args) {
		//Ler 10 valores e mostra maior valor digitado, menor valor digitado e somar totos
		
		int numero, maior = 0, menor = 11, soma = 0; 
		float media = 0;
		
		Scanner tc = new Scanner(System.in);
		
	
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			numero = tc.nextInt();
			
			if(numero > 0) {
				if(numero > maior) {
					maior = numero;
				}
				if(numero < menor) {
				menor = numero;
				}
				
				soma = soma + numero;
				
			}else {
				i--;
				}
			}
		
		
		media = soma / 10;
		
		System.out.println("O maior numero é: " + maior);
		System.out.println("O menor numero é: " + menor);
		System.out.println("A soma dos numeros é: " + soma);
		System.out.printf("A Media é: %.2f" , media);
		
		tc.close();
	}

}
