package Vetores;

import java.util.ArrayList;

public class Ex01_guardar_numeros_pares {

	public static void main(String[] args) {
		//Vetor com 5 elementos inteiros. armazenar apenas os numeros pares.
		
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		
		
		for(int i = 0; i < 5; i++) {
			vetor.add(i);
			if(i % 2 == 0) {
				if(i > 0) {
					pares.add(i);
				}
			}
		}
		
		for(Integer n : pares) {
			System.out.println("Os numeros pares são: " + n);
		}
		
	}

}
