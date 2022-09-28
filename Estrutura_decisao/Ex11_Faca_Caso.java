package Estrutura_decisao;

import java.util.Scanner;

public class Ex11_Faca_Caso {

	public static void main(String[] args) {
		//Ordem de pagamento da IPVA com base no ultimo digito da placa
		// 0 - pagemento em janeiro
		// 1 - Pagamento em Fevereiro
		// 2 - Pagamento em Março
		// 3 - Pagemento em Abril
		// 4 a 9 - Pagamento em Maio
		
		int numeros_placa, ultimo_digito;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite os numeros da placa: ");
		numeros_placa = tc.nextInt();
		
		ultimo_digito = numeros_placa % 10;
		
		switch(ultimo_digito) {
		case 0: {
			System.out.println("Pagamento em Janeiro");	
			break;
		}
		case 1: {
			System.out.println("Pagamento em Fevereiro");
			break;
		}
		case 2: {
			System.out.println("Oagamento em Março");
			break;
		}
		case 3: {
			System.out.println("Pagamento em Abril");
			break;
		}
		default:
			System.out.println("Pagamento em Maio");
		}
		
				
		tc.close();

	}

}
