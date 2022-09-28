package Estrutura_decisao;

import java.util.Scanner;

public class Ex02_Armazezar_se_positivo {

	public static void main(String[] args) {
		// Ler numero e armazenar em A se positivo e em B se negativo.
		//Mostrar resultado
		
		int numero, a, b;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite um numero POSITIVO ou NEGATIVO: ");
		numero = tc.nextInt();
		
		if(numero >= 0) {
			a = numero;
			System.out.println("O numero digitado é positivo: " + a);
		}else {
			b = numero;
			System.out.println("O numeor digitado é negativo: " + b);
		}
		
		
		
		tc.close();

	}

}
