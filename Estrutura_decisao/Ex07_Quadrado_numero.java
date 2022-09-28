package Estrutura_decisao;

import java.util.Scanner;

public class Ex07_Quadrado_numero {

	public static void main(String[] args) {
		// Ler 4 numeros e calcular o quadrado deles. Se o quadrado do numero 3 for maior
		//que 1000 imprimir e finalizar caso não imprimir todos.
		
		int numero1, numero2, numero3, numero4, quadrado1, quadrado2, quadrado3, quadrado4;

		Scanner tc = new Scanner(System.in);
		
		System.out.print("Digite primeiro numeros: ");
		numero1 = tc.nextInt();
		System.out.print("Digite segundo numeros: ");
		numero2 = tc.nextInt();
		System.out.print("Digite terceiro numeros: ");
		numero3 = tc.nextInt();
		System.out.print("Digite quarto numeros: ");
		numero4 = tc.nextInt();
		
		quadrado1 = numero1 * numero1;
		quadrado2 = numero2 * numero2;
		quadrado3 = numero3 * numero3;
		quadrado4 = numero4 * numero4;
		
		if(quadrado3 > 1000) {
			System.out.println("Quadrado 3 é maior que 1000: " + quadrado3);
		}else {
			System.out.printf(" Numero: %d Quadrado é: %d\n ", numero1, quadrado1);
			System.out.printf("Numero: %d Quadrado é: %d\n ", numero2, quadrado2);
			System.out.printf("Numero: %d Quadrado é: %d\n ", numero3, quadrado3);
			System.out.printf("Numero: %d Quadrado é: %d\n ", numero4, quadrado4);
		}
		
		tc.close();
				
		
	}

}
