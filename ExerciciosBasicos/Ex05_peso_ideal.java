package ExerciciosBasicos;


import java.util.Scanner;

public class Ex05_peso_ideal {

	public static void main(String[] args) {
		// Peso Ideal formula (72.7 * altura) - 58
		
		
		float altura, peso_ideal;
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Qual é sua Altura? ");
		altura = tc.nextFloat();
		
		peso_ideal = (float) (72.7 * altura) - 58;
		
		System.out.printf("Seu peso Ideal é: %.2f", peso_ideal);
		
		
		tc.close();
		
		

	}

}
