package ExerciciosBasicos;

import java.util.Scanner;

public class Ex01_soma_multiplicacao {

	public static void main(String[] args) {
		// Somar e multiplicar valores
		
		int numero1, numero2, soma, multiplicacao;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite dois numemros: ");
		numero1 = tc.nextInt();
		numero2 = tc.nextInt();
		
		soma = numero1 + numero2;
		
		multiplicacao = numero1 * numero2;
		
			
		System.out.println("A Soma é: " + soma);
		System.out.println("A multiplicação é: " + multiplicacao);
		
		
		tc.close();

	}

}
