package Estrutura_decisao;

import java.util.Scanner;

public class Ex04_Peso_ideal {

	public static void main(String[] args) {
		// Entradas. Altura e Sexo. calcular peso ideal formulas
		//homens (72.7 * altura) - 58
		//Mulher (62.1 * altura) - 44.7
		
		float altura = 0, peso_ideal = 0;
		char sexo;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Qual é o seu sexo: ");
		sexo = tc.next().charAt(0);
		
		System.out.println("Diga sua altura: ");
		altura = tc.nextFloat();
		
		if(sexo == 'm' || sexo == 'M') {
			peso_ideal = (float)(72.7 * altura) - 58;
			System.out.printf("Sexo masculino e o peso Ideal é %.2f: ", peso_ideal);
		}else if(sexo == 'f' || sexo == 'F') {
			peso_ideal = (float)(62.1 * altura) - (float)44.7;
			System.out.printf("Sexo feminino e o peso Ideal é: %.2f", peso_ideal);
		}else if(sexo != 'm' || sexo != 'f'){
			System.out.println("Sexo não reconhecido");
			
		}
		
		tc.close();
		
	}

}


