package Estrutura_repeticao;

public class Ex02_contar_1_a_100 {

	public static void main(String[] args) {
		//contar de 1 a 100 e mostrar mensagem a cada multiplo de 10
		
		
		for(int i = 0; i <= 100; i++ ) {
			System.out.println(i);
			if(i % 10 == 0) {
				System.out.println("Multiplo de 10");
			}
		}
		

	}

}
