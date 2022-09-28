package Estrutura_repeticao;

import java.util.Scanner;

public class Ex05_usuario_senha {

	public static void main(String[] args) {
		//Digitar usuario e senha. a senha não pode ser igual ao usuario.
		//exibir mensagem caso usuario e senha sejam iguais
		
		String usuario, senha;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite o nome do Usuario: ");
		usuario = tc.next();
		
		System.out.println("Digite o senha do Usuario: ");
		senha = tc.next();
		
		while(usuario.equals(senha)){
			System.out.println("Erro: Usuario e senha não podem ser Iguais. Digite Novamente");
			System.out.println();
			
			System.out.println("Digite o nome do Usuario: ");
			usuario = tc.next();
		
			System.out.println("Digite o senha do Usuario: ");
			senha = tc.next();
		
		}
				
		tc.close();

	}

}
