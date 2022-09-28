package Vetores;

import java.util.Scanner;

public class Ex05_vetor_mostrar_num_acima_50 {

	public static void main(String[] args) {
		//vetor de 10 inteiro. so mostrar os recebido acima de 50
		
		int[] vetor = new int[10];
		boolean maiores_50 = false;
		
		Scanner tc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite um valor %d/10: ", (i+1));
			vetor[i] = tc.nextInt();
		}
			
		for(int i = 0; i < 10; i++) {
			if(vetor[i] > 50) {
				System.out.printf("Valor %d é maior que 50 posiçao %d: \n", vetor[i], i);
				maiores_50 = true;
			}
			
		}
		
		if(!maiores_50) {
			System.out.println("Não existem valores maiores que 50");
		
		}

				
		tc.close();
	}

}
