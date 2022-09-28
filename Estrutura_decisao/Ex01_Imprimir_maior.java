package Estrutura_decisao;

import java.util.Scanner;

public class Ex01_Imprimir_maior {

	public static void main(String[] args) {
		// Ler variavel e imprimi-la se for maior que 100,0 caso contrario imprimir 0,00

		
		int numero;
		
		Scanner tc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor qualquer: ");
		numero = tc.nextInt();
		
		if(numero > 100){
			System.out.println("O Numero digitado foi: " + numero);
		}else {
			numero = 0;
			System.out.println("O numero digitado é menor que 100,00 numero " + numero);
		
		}
		
		tc.close();
		
		
	}

}
