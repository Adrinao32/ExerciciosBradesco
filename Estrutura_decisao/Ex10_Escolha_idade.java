package Estrutura_decisao;

import java.util.Scanner;

public class Ex10_Escolha_idade {

	public static void main(String[] args) {
		/*Classificar nadador nas categorias
		 Infantil-A - de 5 a 7 anos
		 Infantil-B - de 8 a 11 anos
		 Juvenil-A - de 12 a 13 anos
		 Juvenil-B - de 14 a 17 anos
		 Adulto - Maior de 18 anos	 */
		
		
		int idade = 0;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = tc.nextInt();
		
		
		if(idade >= 5 && idade < 8) {
			System.out.println("Sua categoria é INFANTIL-A - Idade: " + idade);
		}else if(idade >= 8 && idade < 12){
			System.out.println("Sua categoria é INFANTIL-B - Idade: " + idade);
		}else if(idade >= 12 && idade < 14){
			System.out.println("Sua categoria é JUVENIL-A - Idade: " + idade);
		}else if(idade >= 14 && idade < 18){
			System.out.println("Sua categoria é JUVENIL-B - Idade: " + idade);
		}else if(idade >= 18){
			System.out.println("Sua categoria é ADULTO - Idade: " + idade);
		}
		
		
		tc.close();
		
	}

}
