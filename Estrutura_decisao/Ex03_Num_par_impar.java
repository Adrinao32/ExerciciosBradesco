package Estrutura_decisao;

import java.util.Scanner;

public class Ex03_Num_par_impar {

	public static void main(String[] args) {
		// ler um numero e ver se é par ou impar. Se PAR armazenar em P se IMPAR em I
		//mostrar numeor
		
		
		int numero, p = 0, i = 0;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = tc.nextInt();
		
		if(numero % 2 == 0) {
			p = numero;
			System.out.println("Numero digitado é PAR: " + p);
		}else {
			i = numero;
			System.out.println("Numero digitado é IMPAR: " + i);
		}
		
		
				
		tc.close();

	}

}
