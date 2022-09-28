package Estrutura_repeticao;

import java.util.Scanner;

public class Ex07_grade {

	public static void main(String[] args) {
		//Testos dos Mouses
		//Defeito 1 - necessita de esfera
		//Defeito 2 - necessita de limpeza
		//Degeito 3 - trocar cabo ou conector
		//Defeito 4 - Quebrado ou Inutilizado
		
		int identificador, situacao = 0, contadorTotal = 0, defeito1 = 0, defeito2 = 0, 
				defeito3 = 0, defeito4 = 0;
		float percent1, percent2, percent3, percent4;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite a identificação: ");
		identificador = tc.nextInt();
		
		while(identificador != 0) {
			
			System.out.println("Qual defeito?\n"
					+ "1 - necessita de esfera\n"
					+ "2 - necessita de limpesa\n"
					+ "3 - torcar cabo ou conector\n"
					+ "4 - Quabrado ou Inutilizado");
			situacao = tc.nextInt();
			
			if(situacao == 1) {
				defeito1 = defeito1 + 1;				
			}
			if(situacao == 2) {
				defeito2 = defeito2 + 1;				
			}
			if(situacao == 3) {
				defeito3 = defeito3 + 1;				
			}
			if(situacao == 4) {
				defeito4 = defeito4 + 1;				
			}
			
			contadorTotal = contadorTotal + 1;
			
			System.out.println("Digite a identificação: ");
			identificador = tc.nextInt();	
			
			
		}
		
		percent1 = ((float)defeito1 / (float)contadorTotal) * (float)100;
		percent2 = ((float)defeito2 / (float)contadorTotal) * (float)100;
		percent3 = ((float)defeito3 / (float)contadorTotal) * (float)100;
		percent4 = ((float)defeito4 / (float)contadorTotal) * (float)100;
		
		System.out.println();
		System.out.println("Total de Mouses testados: " + contadorTotal);
		System.out.println();
		System.out.println("Situaçao\t\t\t quantidade\t percentual");
		System.out.printf("1 - Necesita de esfera:\t\t\t %d \t %.2f%%\n", defeito1, percent1);
		System.out.printf("2 - Necesita de Limpeza:\t\t %d \t %.2f%%\n", defeito2, percent2);
		System.out.printf("3 - Trocar cabo ou conector:\t\t %d \t %.2f%%\n", defeito3, percent3);
		System.out.printf("4 - Quebrado ou Inutilizado:\t\t %d \t %.2f%%\n", defeito4, percent4);
			
		tc.close();
	}

}
