package ExerciciosBasicos;

import java.util.Scanner;

public class Ex02_calculo_estoque_medio {

	public static void main(String[] args) {
		// Calcular o estoque medio de uma pa�a.
		//estoque_medio = (quantidade_minima + quantidade_maxima) / 2
		
		
		int quantidade_minima, quantidade_maxima, soma; 
		float media;
		
		Scanner tc = new Scanner(System.in);
		
		
		System.out.println("Digie a quantidade minima e a quantidade maxima: ");
		quantidade_minima = tc.nextInt();
		quantidade_maxima = tc.nextInt();
		
		soma = quantidade_maxima + quantidade_minima;
		
		media = soma / 2;
		
		System.out.println("A soma �: " + soma);
		System.out.printf("A Quantidade media em estoque � %.2f: ", media);
		
		
		tc.close();

	}

}
