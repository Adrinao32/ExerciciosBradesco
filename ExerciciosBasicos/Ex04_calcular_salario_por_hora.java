package ExerciciosBasicos;

import java.util.Scanner;

public class Ex04_calcular_salario_por_hora {

	public static void main(String[] args) {
		// Quanto vc ganha por hora e o numero de horas trabalhadas no mês.
		//mostrar totaldo salario no mês
		
		
		int horas_trabalhadas;
		float valor_hora, salario_mes;
		
		Scanner tc =  new Scanner(System.in);
		
		
		System.out.println("Quantas horas você trabalhou no mês: ");
		horas_trabalhadas = tc.nextInt();
		
		System.out.println("Qual valor da hora trabalhada: ");
		valor_hora = tc.nextInt();
		
		salario_mes = horas_trabalhadas * valor_hora;
		
		System.out.printf("Seu salario no mês é: %.2f", salario_mes);
		
		
		tc.close();
	}

}
