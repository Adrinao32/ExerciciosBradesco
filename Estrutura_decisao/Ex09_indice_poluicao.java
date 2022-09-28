package Estrutura_decisao;

import java.util.Scanner;

public class Ex09_indice_poluicao {

	public static void main(String[] args) {
		// Controle de poluição. Tres grupos de industria. 
		//indice de poluição aceitavel 0,05 a 0,25
		//indice em 0,3 as empresas do grupo 1° devem suspender as atividades
		//indice em 0,4 as empresas do grupo 1° e 2° devem suspender as atividades
		//indice em 0,5 todas as empresas devem suspender as atividades
		
		double indice_de_poluicao = 0;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Qual indice de poluição? ");
		indice_de_poluicao = tc.nextDouble();
		
		if(indice_de_poluicao <= 0.25) {
			System.out.println("Indice de poluição Aceitável: " + indice_de_poluicao);		
		}else if(indice_de_poluicao >= 0.3 && indice_de_poluicao < 0.4){
			System.out.println("Empresas do Grupo 1° devem suspender as atividades " + indice_de_poluicao);	
		}else if(indice_de_poluicao >= 0.4 && indice_de_poluicao < 0.5){
			System.out.println("Empresas do Grupo 1° e 2° devem suspender as atividades " + indice_de_poluicao);	
		}else if(indice_de_poluicao >= 0.5){
			System.out.println("Empresas todos os Grupos devem suspender as atividades " + indice_de_poluicao);	
		}
		
		tc.close();
		
	}

}
