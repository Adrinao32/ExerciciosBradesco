package Estrutura_decisao;

import java.util.Scanner;

public class Ex08_num_par_impar_positivo_negativo {

	public static void main(String[] args) {
		// ler numero inteiro e indicar se é PAR ou IMPAR se é positivo ou negativo
		
		int numero;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digie um numero: ");
		numero = tc.nextInt();
		
		if(numero % 2 == 0 && numero > 0){
			System.out.printf("Numero %d é PAR e POSITIVO" , numero);
		}else if(numero % 2 != 0 && numero > 0) {
			System.out.printf("Numero %d é IMPAR e POSITIVO" , numero);
		}else if(numero % 2 == 0 && numero < 0) {
			System.out.printf("Numero %d é PAR e NEGATIVO" , numero);
		}else if(numero % 2 != 0 && numero < 0) {
			System.out.printf("Numero %d é IMPAR e NEGATIVO" , numero);	
		
		}
		
		
		tc.close();
		
		
	}

}
