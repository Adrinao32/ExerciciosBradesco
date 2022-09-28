package Estrutura_repeticao;

public class Ex03_escrever_numeros_impar {

	public static void main(String[] args) {
		//escrever so nemeros imares entre 100 a 200
		
		for(int i = 100; i <= 200; i++ ) {
			if(i % 2 != 0) {
				System.out.println("IMPAR: " + i);
			}
		}
		

	}

}
