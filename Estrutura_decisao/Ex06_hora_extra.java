package Estrutura_decisao;

import java.util.Scanner;

public class Ex06_hora_extra {

	public static void main(String[] args) {
		// Calcular hora extra onde valor hora normal = 10,00 e valor da hora extra 20,00
		//quantidade total de trabalho 50h
		
		int quantidade_horas_trabalhadas, horas_extras = 0;
		float valor_hora_extra = 0, salario = 0, salario_total = 0;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Quantidade de horas trabalhadas no mês foi? ");
		quantidade_horas_trabalhadas = tc.nextInt();
		
		if(quantidade_horas_trabalhadas > 50) {
			horas_extras = quantidade_horas_trabalhadas - 50;
			salario = (quantidade_horas_trabalhadas - horas_extras) * (float) 10.00;
			valor_hora_extra = horas_extras * (float) 20.00;
			salario_total = salario + valor_hora_extra;
			
		}else
			salario = quantidade_horas_trabalhadas * (float) 10.00;
			salario_total = salario;
		
		System.out.printf("O salario no mês é de R$ %.2f\n", salario);
		System.out.println("A quantidade de horas extras no mês foi de: " + horas_extras + "h");
		System.out.printf("Valor das horas extras foi de R$: %.2f%n", valor_hora_extra);
		System.out.printf("O salario total no mês R$ %.2f", salario_total);
		
		
		tc.close();
		

	}

}
