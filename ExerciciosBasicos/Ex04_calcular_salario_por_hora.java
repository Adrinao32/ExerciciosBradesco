package ExerciciosBasicos;

import java.util.Scanner;

public class Ex04_calcular_salario_por_hora {

	public static void main(String[] args) {
		// Quanto vc ganha por hora e o numero de horas trabalhadas no m�s.
		//mostrar totaldo salario no m�s
		
		
		int horas_trabalhadas;
		float valor_hora, salario_mes;
		
		Scanner tc =  new Scanner(System.in);
		
		
		System.out.println("Quantas horas voc� trabalhou no m�s: ");
		horas_trabalhadas = tc.nextInt();
		
		System.out.println("Qual valor da hora trabalhada: ");
		valor_hora = tc.nextInt();
		
		salario_mes = horas_trabalhadas * valor_hora;
		
		System.out.printf("Seu salario no m�s �: %.2f", salario_mes);
		
		
		tc.close();
	}

}
