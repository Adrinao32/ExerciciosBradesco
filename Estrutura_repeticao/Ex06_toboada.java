package Estrutura_repeticao;

import java.util.Scanner;

public class Ex06_toboada {

	public static void main(String[] args) {
		// Criar taboada
		
		int numero;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Digite um numero entre 1 e 10: ");
		numero = tc.nextInt();
		System.out.println();
		
		while(numero < 1 || numero > 10) {
			System.out.println("Informe um numero entre 1 e 10: ");
			numero = tc.nextInt();
						
		}
		
		System.out.println("Taboada do numero: " + numero);
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", numero, i, (numero * i));
		}
		
		
		tc.close();
		
	}
		
	
}
