package ExerciciosBasicos;

import java.util.Scanner;

public class Ex03_converter_metros_sentimetros {

	public static void main(String[] args) {
		// Converter metros para sentimetros
		
		int metros;
		int centimetros;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de metros: ");
		metros = tc.nextInt();
		
		centimetros = metros * 100;
		
		System.out.printf(metros + " metros em centimetros é: " + centimetros);
		
		
		tc.close();
		

	}

}
