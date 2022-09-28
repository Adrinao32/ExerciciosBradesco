package Estrutura_repeticao;

import java.util.Scanner;

public class Ex01_maior_valor {

	public static void main(String[] args) {
		//Determinar o maior valor entre os numeros digitados. condição de parada 0
		
		int numero, maior = 0;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = tc.nextInt();
		
		while (numero != 0){
			if(maior < numero) {
				maior = numero;
			}
			
			System.out.println("Digite um numero: ");
			numero = tc.nextInt();
		}
		
		System.out.println("O maior numero digitado foi: " + maior);
		
		
		tc.close();
	}

}
